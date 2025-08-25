package GiaiBaiTap;

import java.util.Arrays;

public class NextPermutations {

    public static void main(String[] args) {
        // Hoán vị ban đầu
        String initialPermutation = "12763548AB9";
        // Số lượng hoán vị liền sau cần tìm
        int count = 24;

        // Chuyển đổi chuỗi hoán vị thành mảng các ký tự
        char[] chars = initialPermutation.toCharArray();

        // Tìm hoán vị kế tiếp
        for (int i = 1; i <= count; i++) {
            if (!nextPermutation(chars)) {
                break;
            }
            System.out.println("Hoán vị " + i + ": " + new String(chars));
        }
    }

    public static boolean nextPermutation(char[] seq) {
        // Step 1: Find the largest index i such that seq[i] < seq[i + 1]
        int i = seq.length - 2;
        while (i >= 0 && seq[i] >= seq[i + 1]) {
            i--;
        }

        if (i == -1) {
            return false;  // No next permutation
        }

        // Step 2: Find the largest index j > i such that seq[j] > seq[i]
        int j = seq.length - 1;
        while (seq[j] <= seq[i]) {
            j--;
        }

        // Step 3: Swap seq[i] and seq[j]
        char temp = seq[i];
        seq[i] = seq[j];
        seq[j] = temp;

        // Step 4: Reverse the subsequence seq[i + 1:]
        int start = i + 1;
        int end = seq.length - 1;
        while (start < end) {
            temp = seq[start];
            seq[start] = seq[end];
            seq[end] = temp;
            start++;
            end--;
        }

        return true;
    }
}

