import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, tempNumber, basValue, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println(number + " sayısının rakamları toplamı : " + result);

        input.close();
    }
}
