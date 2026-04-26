import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);

        input.close();
    }
}
