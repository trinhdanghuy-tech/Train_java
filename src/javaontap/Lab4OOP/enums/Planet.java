package javaontap.Lab4OOP.enums;

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6), // Hằng số với tham số
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.972e+24, 6.371e6);
    private final double mass;  //Khối lượng
    private final double radius; //Bán kính

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    public double getMass() {
        return mass;
    }
    public double getRadius() {
        return radius;
    }
    public double surfaceGravity() {
        final double G = 6.67430e-11;
        return G * mass / (radius * radius);
    }
}
