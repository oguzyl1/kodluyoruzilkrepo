import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". Sayıyı Giriniz : ");
            sayilar[i] = input.nextInt();
        }

        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = 0; j < sayilar.length - i - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }
            }
        }
        System.out.print("Sıralama : ");
        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }
        System.out.println();

        input.close();
    }
}
