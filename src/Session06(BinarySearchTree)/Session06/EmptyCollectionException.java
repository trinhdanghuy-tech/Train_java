public class EmptyCollectionException extends RuntimeException {
    public EmptyCollectionException(String collection) {
        super(collection);
    }
}
