import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day, dateValue;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay (1-12): ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        dateValue = (month * 100) + day;

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            if (dateValue <= 121 || dateValue >= 1222) {
                burc = "Oğlak";
            } else if (dateValue <= 219) {
                burc = "Kova";
            } else if (dateValue <= 320) {
                burc = "Balık";
            } else if (dateValue <= 420) {
                burc = "Koç";
            } else if (dateValue <= 521) {
                burc = "Boğa";
            } else if (dateValue <= 622) {
                burc = "İkizler";
            } else if (dateValue <= 722) {
                burc = "Yengeç";
            } else if (dateValue <= 822) {
                burc = "Aslan";
            } else if (dateValue <= 922) {
                burc = "Başak";
            } else if (dateValue <= 1022) {
                burc = "Terazi";
            } else if (dateValue <= 1121) {
                burc = "Akrep";
            } else {
                burc = "Yay";
            }

            System.out.println("Merhaba, burcunuz : " + burc);
        }

        input.close();
    }
}
