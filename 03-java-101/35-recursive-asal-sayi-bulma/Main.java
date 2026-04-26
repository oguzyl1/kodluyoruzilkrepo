import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scan.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }

        scan.close();
    }
}
