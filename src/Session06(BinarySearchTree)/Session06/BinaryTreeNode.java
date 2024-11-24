public class BinaryTreeNode<T> {
    protected T element;
    protected BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T obj) {
        element = obj;
        left = null;
        right = null;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    public T getElement() {
        return element;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }
}
