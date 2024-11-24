import java.util.Iterator;
public class MainProgram {
    public static void main(String[] args) {
        LinkedBinaryTree<String> treeE = new LinkedBinaryTree<String>("E", null, null);
        LinkedBinaryTree<String> treeD = new LinkedBinaryTree<String>("D", null, null);
        LinkedBinaryTree<String> treeC = new LinkedBinaryTree<String>("C", treeD, treeE);
        LinkedBinaryTree<String> treeB = new LinkedBinaryTree<String>("B", null, null);
        LinkedBinaryTree<String> treeA = new LinkedBinaryTree<String>("A", treeB, treeC);

        Iterator<String> inOrderTraversal = treeA.iteratorInOrder();

        while(inOrderTraversal.hasNext()) {
            String next = inOrderTraversal.next();
            System.out.println(next);
        }
    }
}