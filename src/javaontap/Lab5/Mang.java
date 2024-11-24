package javaontap.Lab5;

import java.util.ArrayList;

public class Mang {
    public static void main(String[] args) {
        int a = 10;
        ArrayList a1 = new ArrayList<>();
        a1.add("Huy");
        a1.add("Hu");
        a1.add(2);
        a1.remove(1);
        ArrayList<String> b1 = new ArrayList<>();
        System.out.println(a1.toString());
        System.out.println(a1.get(0));
        
    }
}
