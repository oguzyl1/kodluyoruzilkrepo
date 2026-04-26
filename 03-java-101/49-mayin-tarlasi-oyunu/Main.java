import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;

        System.out.println("Mayın Tarlası Oyunu");

        while (true) {
            System.out.print("Satır sayısını giriniz : ");
            row = scan.nextInt();
            System.out.print("Sütun sayısını giriniz : ");
            col = scan.nextInt();

            if (row < 2 || col < 2) {
                System.out.println("Lütfen minimum 2x2 boyutunda bir matris giriniz !");
            } else {
                break;
            }
        }

        MineSweeper mine = new MineSweeper(row, col);
        mine.run();

        scan.close();
    }
}
