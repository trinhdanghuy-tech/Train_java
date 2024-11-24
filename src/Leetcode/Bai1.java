package Leetcode;

import java.util.Scanner;

public class Bai1 {
    public int[] twoSum(int[] nums, int target) {
        Scanner scanner = new Scanner(System.in);
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            int sum = target + nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Bai1 b = new Bai1();
        int[] result = b.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
