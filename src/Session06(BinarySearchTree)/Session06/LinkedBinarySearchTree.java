public class LinkedBinarySearchTree<T extends Comparable<T>> extends LinkedBinaryTree<T> implements BinarySearchTreeADT<T> {
    public LinkedBinarySearchTree() {
        super();
    }

    public LinkedBinarySearchTree(T element, LinkedBinarySearchTree<T> leftSubTree, LinkedBinarySearchTree<T> rightSubTree) {
        super(element, leftSubTree, rightSubTree);
    }

    @Override
    public void addElement(T element) {
        BinaryTreeNode<T> temp = new BinaryTreeNode<T>(element);
        if (isEmpty()) {
            root = temp;
        } else {
            BinaryTreeNode<T> current = root;
            boolean added = false;
            while (!added) {
                if (element.compareTo(current.getElement()) < 0) {
                    if (current.getLeft() == null) {
                        current.setLeft(temp);
                        added = true;
                    } else {
                        current = current.getLeft();
                    }
                } else {
                    if (current.getRight() == null) {
                        current.setRight(temp);
                        added = true;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }
        count++;
    }

    @Override
    public T removeElement(T targetElement) {
        T result = null;
        if (!isEmpty()) {
            if (targetElement.compareTo(root.getElement()) == 0) {
                result = root.getElement();
                root = replacement(root);
                count--;
            } else {
                BinaryTreeNode<T> current, parent = root;
                boolean found = false;
                if (targetElement.compareTo(root.getElement()) < 0) {
                    current = root.getLeft();
                } else {
                    current = root.getRight();
                }
                while (current != null && !found) {
                    if (targetElement.compareTo(current.getElement()) == 0) {
                        found = true;
                        count--;
                        result = current.getElement();
                        if (current == parent.getLeft()) {
                            parent.setLeft(replacement(current));
                        } else {
                            parent.setRight(replacement(current));
                        }
                    } else {
                        parent = current;
                        if (targetElement.compareTo(current.getElement()) < 0) {
                            current = current.getLeft();
                        } else {
                            current = current.getRight();
                        }
                    }
                }
                if (!found) {
                    throw new ElementNotFoundException("LinkedBinarySearchTree");
                }
            }
        }   
        return result;
    }

    private BinaryTreeNode<T> replacement(BinaryTreeNode<T> node) {
        BinaryTreeNode<T> result = null;
        if ((node.getLeft() == null) && (node.getRight() == null)) {
            result = null;
        } else if ((node.getLeft() != null) && (node.getRight() == null)) {
            result = node.getLeft();
        } else if ((node.getLeft() == null) && (node.getRight() != null)) {
            result = node.getRight();
        } else {
            BinaryTreeNode<T> current = node.getRight();
            BinaryTreeNode<T> parent = node;
            while (current.getLeft() != null) {
                parent = current;
                current = current.getLeft();
            }
            current.setLeft(node.getLeft());
            if (node.getRight() != current) {
                parent.setLeft(current.getRight());
                current.setRight(node.getRight());
            }
            result = current;
        }
        return result;
    }
}
