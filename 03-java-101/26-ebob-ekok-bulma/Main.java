import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("n1 Sayısını Giriniz : ");
        n1 = input.nextInt();
        System.out.print("n2 Sayısını Giriniz : ");
        n2 = input.nextInt();

        int ebob = 1;
        int ekok = 1;

        int i = (n1 < n2) ? n1 : n2;

        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);

        input.close();
    }
}
