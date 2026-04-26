import java.util.Scanner;

public class Main {
    static void generatePattern(int n) {
        System.out.print(n + " ");

        if (n > 0) {
            generatePattern(n - 5);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = scan.nextInt();

        System.out.print("Çıktısı : ");
        generatePattern(n);

        scan.close();
    }
}
