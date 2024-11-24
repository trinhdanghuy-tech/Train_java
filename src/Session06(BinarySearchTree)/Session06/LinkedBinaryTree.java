import java.util.ArrayList;
import java.util.Iterator;

public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {
    protected BinaryTreeNode<T> root;
    protected int count;

    public LinkedBinaryTree() {
        root = null;
        count = 0;
    }

    public LinkedBinaryTree(T element, LinkedBinaryTree<T> leftSubTree, LinkedBinaryTree<T> rightSubTree) {
        count = 1;
        root = new BinaryTreeNode<T>(element);
        if (leftSubTree != null) {
            count = count + leftSubTree.getCount();
            root.setLeft(leftSubTree.getRootNode());
        } else {
            root.setLeft(null);
        }

        if (rightSubTree != null) {
            count = count + rightSubTree.getCount();
            root.setRight(rightSubTree.getRootNode());
        } else {
            root.setRight(null);
        }
    }

    public boolean contains(T targetElement) {
        boolean found = false;
        try {
            T temp = find(targetElement);
            found = true;
        } catch (ElementNotFoundException e) {
            found = false;
        }
        return found;
    }

    private T find(T targetElement) {
        BinaryTreeNode<T> result = findNode(targetElement, root);
        if (result == null)
            throw new ElementNotFoundException("LinkedBinaryTree");
        return result.getElement();
    }

    private BinaryTreeNode<T> findNode(T targetElement, BinaryTreeNode<T> next) {
        if (next == null)
            return null;

        if (next.getElement().equals(targetElement))
            return next;

        BinaryTreeNode<T> left = findNode(targetElement, next).getLeft();
        if (left != null)
            return left;

        BinaryTreeNode<T> right = findNode(targetElement, next).getRight();
        if (right != null)
            return right;
        
        return null;
    }

    public Iterator<T> iteratorInOrder() {
        ArrayList<T> temp = new ArrayList<T>();
        inOrder(root, temp);
        return temp.iterator();
    }

    private void inOrder(BinaryTreeNode<T> root, ArrayList<T> temp) {
        if (root != null)
        {
            inOrder(root.getLeft(), temp);
            temp.add(root.getElement());
            inOrder(root.getRight(), temp);
        }
    }

    public int getCount() {
        return count;
    }

    public BinaryTreeNode<T> getRootNode() {
        if(root == null)
            throw new EmptyCollectionException("Linked Binary Tree");
        return root;
    }

    public T getRootElement() {
        if(root == null)
            throw new EmptyCollectionException("Linked Binary Tree");        
        return root.getElement();
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public int size() {
        return count;
    }
}
