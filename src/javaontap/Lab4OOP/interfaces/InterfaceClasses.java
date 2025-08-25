package javaontap.Lab4OOP.interfaces;

public interface InterfaceClasses {
    void draw();

    default void erase() {
        System.out.println("Đang xóa");
    }
}
