public interface BinarySearchTreeADT<T extends Comparable<T>> extends BinaryTreeADT<T> {
    public void addElement(T element);
    public T removeElement(T targetElement) throws ElementNotFoundException;
    // public void removeAllOccurrences(T targetElement) throws ElementNotFoundException;
    // public T removeMin() throws EmptyCollectionException;
    // public T removeMax() throws EmptyCollectionException;
    // public T findMin() throws EmptyCollectionException;
    // public T findMax() throws EmptyCollectionException;
}
