package GiaiBaiTap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextCombinations {

    public static void main(String[] args) {
        // Tập hợp các ký tự
        Character[] baseSet = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Arrays.sort(baseSet);

        // Tổ hợp ban đầu
        Character[] initialCombination = {'1','3','6','7','8','9','A','D','F'};
        Arrays.sort(initialCombination);

        // Số phần tử trong tổ hợp
        int n = 9;

        // Số lượng tổ hợp liền sau cần tìm
        int count = 24;

        // Tạo tất cả tổ hợp chập n
        List<List<Character>> allCombinations = generateCombinations(baseSet, n);
        Collections.sort(allCombinations, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });

        // Tìm vị trí của tổ hợp ban đầu
        int initialIndex = findCombinationIndex(allCombinations, initialCombination);

        // Lấy `count` tổ hợp liền sau
        List<List<Character>> nextCombs = allCombinations.subList(initialIndex + 1, initialIndex + 1 + count);

        // In kết quả
        for (int i = 0; i < nextCombs.size(); i++) {
            System.out.println("Tổ hợp " + (i + 1) + ": " + nextCombs.get(i));
        }
    }

    private static List<List<Character>> generateCombinations(Character[] baseSet, int k) {
        List<List<Character>> combinations = new ArrayList<>();
        generateCombinations(combinations, new ArrayList<>(), baseSet, k, 0);
        return combinations;
    }

    private static void generateCombinations(List<List<Character>> combinations, List<Character> current, Character[] baseSet, int k, int start) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < baseSet.length; i++) {
            current.add(baseSet[i]);
            generateCombinations(combinations, current, baseSet, k, i + 1);
            current.remove(current.size() - 1);
        }
    }

    private static int findCombinationIndex(List<List<Character>> allCombinations, Character[] combination) {
        for (int i = 0; i < allCombinations.size(); i++) {
            List<Character> comb = allCombinations.get(i);
            if (Arrays.equals(comb.toArray(new Character[0]), combination)) {
                return i;
            }
        }
        return -1;
    }
}

