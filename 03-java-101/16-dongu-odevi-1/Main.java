import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, count = 0, sum = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                if (i != 0) {
                    sum += i;
                    count++;
                }
            }
        }

        if (count > 0) {
            average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması : " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen herhangi bir sayı bulunamadı.");
        }

        input.close();
    }
}
