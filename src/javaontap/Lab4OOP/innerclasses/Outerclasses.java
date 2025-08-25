package javaontap.Lab4OOP.innerclasses;

public class Outerclasses {
    int x = 10;
    //Lớp lồng tĩnh
    static class InnerClass {
        int y = 20;
    }
    // Lớp lồng không tĩnh
    class InnerClass2 {
        int z = 30;
    }
    public void display(){
        class InnerClass3 {
            public void print() {
                System.out.println("BIM BIM");
            }
        }
    }
}
