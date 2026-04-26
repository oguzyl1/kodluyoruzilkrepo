import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;
        long nFact = 1, rFact = 1, nrFact = 1, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Sınıf mevcudunu (n) giriniz : ");
        n = input.nextInt();
        System.out.print("Grup sayısını (r) giriniz : ");
        r = input.nextInt();

        if (n >= r) {
            for (int i = 1; i <= n; i++) {
                nFact *= i;
            }
            for (int i = 1; i <= r; i++) {
                rFact *= i;
            }
            for (int i = 1; i <= (n - r); i++) {
                nrFact *= i;
            }

            result = nFact / (rFact * nrFact);
            System.out.println("C(" + n + "," + r + ") kombinasyonu : " + result);
        } else {
            System.out.println("n değeri r değerinden küçük olamaz!");
        }

        input.close();
    }
}
