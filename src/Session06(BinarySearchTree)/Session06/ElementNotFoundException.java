public class ElementNotFoundException extends RuntimeException {
    public ElementNotFoundException(String collection) {
        super(collection);
    }
}
