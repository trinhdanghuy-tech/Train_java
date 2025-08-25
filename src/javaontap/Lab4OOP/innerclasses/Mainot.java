package javaontap.Lab4OOP.innerclasses;

public class Mainot {
    public static void main(String[] args) {
        Outerclasses outer = new Outerclasses();
        Outerclasses.InnerClass2 innerClass = outer.new InnerClass2(); // Lớp lồng không tĩnh
        Outerclasses.InnerClass inner = new Outerclasses.InnerClass(); // Lớp lồng tĩnh
        System.out.println(outer.x + inner.y); //Output 30
        System.out.println(outer.x * innerClass.z); //Output 300
    }
}
