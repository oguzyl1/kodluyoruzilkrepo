import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };

        System.out.println("Dizi : " + Arrays.toString(list));

        Arrays.sort(list);

        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            while (i + 1 < list.length && list[i] == list[i + 1]) {
                count++;
                i++;
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
