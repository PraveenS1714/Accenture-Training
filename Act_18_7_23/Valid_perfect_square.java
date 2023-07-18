package Test_18_7_23;

import java.util.Scanner;

public class Valid_perfect_square{
    public static boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;

        if (num == 0 || num == 1)
            return true;

        long start = 1;
        long end = num / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == num)
                return true;

            if (square < num)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPerfect = isPerfectSquare(num);
        System.out.println(num + " is a perfect square: " + isPerfect);
    }
}