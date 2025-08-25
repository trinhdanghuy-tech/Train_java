package Baitoancaibalo;

public class Node implements Comparable<Node> {
    public int level, value, weight;
    public double bound;

    public Node(int level, int value, int weight, double bound) {
        this.level = level;
        this.value = value;
        this.weight = weight;
        this.bound = bound;
    }

    @Override
    public int compareTo(Node other) {
        return Double.compare(other.bound, this.bound); // Sắp xếp giảm dần theo bound
    }
}
