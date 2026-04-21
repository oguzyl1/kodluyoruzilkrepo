import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, cevre, alpha, dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

        System.out.print("Merkez açısının ölçüsünü (𝛼) giriniz : ");
        alpha = input.nextDouble();

        dilimAlan = (pi * (r * r) * alpha) / 360;
        System.out.println("Daire Diliminin Alanı : " + dilimAlan);

        input.close();
    }
}
