package javaontap.Lab4OOP.polymorphism;

public class Calculator {
    public int add(int a, int b) {
        System.out.println("Phương thức 1");
        return a + b;
    }
    public int add(int a, int b, int c) {
        System.out.println("Phương thức 2");
        return a + b + c;
    }
    public double add(double a, double b) {
        System.out.println("Phương thức 3");
        return a * b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(10.4, 20.7));
        System.out.println(calc.add(10, 20, 20));
        System.out.println(calc.add(10.7, 10.3));
    }
}
