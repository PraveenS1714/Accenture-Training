package Test_18_7_23;

import java.util.Scanner;

public class Arranging_coins{
    public static int countCompleteRows(int n) {
        int row = 1;
        while (n >= row) {
            n -= row;
            row++;
        }
        return row - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of coins (n): ");
        int n = scanner.nextInt();

        int completeRows = countCompleteRows(n);
        System.out.println("The number of complete rows in the staircase: " + completeRows);
    }
}