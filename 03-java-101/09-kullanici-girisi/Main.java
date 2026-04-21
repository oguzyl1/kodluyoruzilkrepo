import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz : ");
            select = inp.nextInt();
            inp.nextLine();

            if (select == 1) {
                System.out.print("Yeni Şifreniz : ");
                newPassword = inp.nextLine();

                if (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Giriş sonlandırıldı.");
            }
        }

        inp.close();
    }
}
