package javaontap.Lab4OOP.enums;

public class Main {
    public static void main(String[] args) {
        Planet earth = Planet.EARTH;
        System.out.println("Khối lượng: " + earth.getMass());   // Khối lượng: 5.972E24
        System.out.println("Lực hấp dẫn: " +earth.surfaceGravity()); // Lực hấp dẫn: 9.819973426224687
    }
}
