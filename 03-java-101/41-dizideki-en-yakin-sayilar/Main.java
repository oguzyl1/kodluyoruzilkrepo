import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int target = input.nextInt();

        Arrays.sort(list);

        int minClosest = list[0];
        int maxClosest = list[list.length - 1];
        for (int i : list) {

            if (i < target) {
                minClosest = i;
            }

            if (i > target) {
                maxClosest = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxClosest);

        input.close();
    }
}
