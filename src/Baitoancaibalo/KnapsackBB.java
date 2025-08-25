package Baitoancaibalo;

import java.util.PriorityQueue;

public class KnapsackBB {
    static int knapsack(int[] weights, int[] values, int W) {
        int n = weights.length;
        int maxValue = 0;

        // Hàng đợi ưu tiên (Priority Queue) để duy trì các nút
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(-1, 0, 0, Double.POSITIVE_INFINITY));

        while (!pq.isEmpty()) {
            Node node = pq.poll();

            // Bỏ qua nếu cận nhỏ hơn giá trị tối đa hiện tại
            if (node.bound <= maxValue) continue;

            // Nếu đã duyệt đến cấp cuối cùng
            if (node.level == n - 1) continue;

            int nextLevel = node.level + 1;

            // Trường hợp chọn đồ vật ở cấp tiếp theo
            int newWeight = node.weight + weights[nextLevel];
            int newValue = node.value + values[nextLevel];

            if (newWeight <= W) {
                maxValue = Math.max(maxValue, newValue); // Cập nhật giá trị tối đa
                double newBound = bound(newWeight, newValue, nextLevel, weights, values, W);
                pq.add(new Node(nextLevel, newValue, newWeight, newBound));
            }

            // Trường hợp không chọn đồ vật ở cấp tiếp theo
            double boundWithout = bound(node.weight, node.value, nextLevel, weights, values, W);
            pq.add(new Node(nextLevel, node.value, node.weight, boundWithout));
        }
        return maxValue;
    }

    static double bound(int weight, int value, int level, int[] weights, int[] values, int W) {
        if (weight >= W) return 0;
        double bound = value;
        int totalWeight = weight;

        // Tính cận tối đa bằng cách thêm các đồ vật tiếp theo
        for (int i = level + 1; i < weights.length && totalWeight + weights[i] <= W; i++) {
            totalWeight += weights[i];
            bound += values[i];
        }

        // Nếu còn dư trọng lượng, thêm phần giá trị ước lượng của đồ vật tiếp theo
        if (level + 1 < weights.length) {
            bound += (W - totalWeight) * ((double) values[level + 1] / weights[level + 1]);
        }
        return bound;
    }

    public static void main(String[] args) {
        int[] weights = {2, 3, 4, 5};
        int[] values = {40, 50, 100, 95};
        int W = 8;

        System.out.println("Giá trị lớn nhất có thể lấy: " + knapsack(weights, values, W));
    }
}
