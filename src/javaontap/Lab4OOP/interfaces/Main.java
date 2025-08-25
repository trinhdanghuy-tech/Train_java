package javaontap.Lab4OOP.interfaces;

public class Main {
    public static void main(String[] args) {
        InterfaceClasses cir = new Circle();
        InterfaceClasses square = new Square();

        cir.draw();
        cir.erase();
        square.draw();
        square.erase();
    }
}
