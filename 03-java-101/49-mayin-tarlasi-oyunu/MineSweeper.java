import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    String[][] map;
    String[][] board;
    boolean isGameOn = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        int row, col, success = 0;
        prepareGame();
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        while (isGameOn) {
            print(board);
            System.out.print("Satır Giriniz : ");
            row = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            col = scan.nextInt();

            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinat ! Lütfen sınırlar dahilinde giriniz.");
                continue;
            }

            if (!board[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (map[row][col].equals("*")) {
                isGameOn = false;
                System.out.println("Game Over!!");
            } else {
                int mineCount = checkMine(row, col);
                board[row][col] = String.valueOf(mineCount);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Tebrikler! Oyunu Kazandınız !");
                    print(board);
                    break;
                }
            }
        }
    }

    public int checkMine(int r, int c) {
        int count = 0;
        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber) {
                    if (map[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                map[i][j] = "-";
                board[i][j] = "-";
            }
        }

        while (count < (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (!map[randRow][randCol].equals("*")) {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }

    public void print(String[][] arr) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}
