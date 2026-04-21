import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, yolculukTipi;
        double birimFiyat = 0.10, tutar, yasIndirimi, tipIndirimi;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            tutar = km * birimFiyat;
            if (yas < 12) {
                yasIndirimi = tutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = tutar * 0.10;
            } else if (yas >= 65) {
                yasIndirimi = tutar * 0.30;
            } else {
                yasIndirimi = 0;
            }

            tutar -= yasIndirimi;

            if (yolculukTipi == 2) {
                tipIndirimi = tutar * 0.20;
                tutar = (tutar - tipIndirimi) * 2;
            }

            System.out.println("Toplam Tutar = " + tutar + " TL");
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
