import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c, u, alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Dik Kenarı Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Dik Kenarı Giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenüs : " + c);

        u = (a + b + c) / 2.0;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);

        girdi.close();
    }
}
