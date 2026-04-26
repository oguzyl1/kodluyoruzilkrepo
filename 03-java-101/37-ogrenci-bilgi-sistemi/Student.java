public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int matNote, int matVerbal, int fizikNote, int fizikVerbal, int kimyaNote, int kimyaVerbal) {
        if (matNote >= 0 && matNote <= 100) this.mat.note = matNote;
        if (matVerbal >= 0 && matVerbal <= 100) this.mat.verbalNote = matVerbal;

        if (fizikNote >= 0 && fizikNote <= 100) this.fizik.note = fizikNote;
        if (fizikVerbal >= 0 && fizikVerbal <= 100) this.fizik.verbalNote = fizikVerbal;

        if (kimyaNote >= 0 && kimyaNote <= 100) this.kimya.note = kimyaNote;
        if (kimyaVerbal >= 0 && kimyaVerbal <= 100) this.kimya.verbalNote = kimyaVerbal;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + String.format("%.2f", this.average));
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matAvg = (this.mat.verbalNote * this.mat.verbalWeight) + (this.mat.note * (1 - this.mat.verbalWeight));
        double fizikAvg = (this.fizik.verbalNote * this.fizik.verbalWeight) + (this.fizik.note * (1 - this.fizik.verbalWeight));
        double kimyaAvg = (this.kimya.verbalNote * this.kimya.verbalWeight) + (this.kimya.note * (1 - this.kimya.verbalWeight));
        
        this.average = (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu (Sınav/Sözlü) : " + this.mat.note + " / " + this.mat.verbalNote);
        System.out.println("Fizik Notu (Sınav/Sözlü)     : " + this.fizik.note + " / " + this.fizik.verbalNote);
        System.out.println("Kimya Notu (Sınav/Sözlü)     : " + this.kimya.note + " / " + this.kimya.verbalNote);
    }
}
