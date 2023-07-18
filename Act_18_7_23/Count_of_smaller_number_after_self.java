package Test_18_7_23;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Count_of_smaller_number_after_self{
    public static List<Integer> countSmaller(int[] nums) {
        Integer[] result = new Integer[nums.length];
        List<Integer> sorted = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int index = findIndex(sorted, nums[i]);
            result[i] = index;
            sorted.add(index, nums[i]);
        }

        return Arrays.asList(result);
    }

    private static int findIndex(List<Integer> sorted, int target) {
        int left = 0;
        int right = sorted.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (sorted.get(mid) >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        int[] nums = new int[count];
        System.out.println("Enter the elements:");
        for (int i = 0; i < count; i++) {
            nums[i] = scanner.nextInt();
        }

        List<Integer> counts = countSmaller(nums);
        System.out.println("Counts: " + counts);
    }
}
