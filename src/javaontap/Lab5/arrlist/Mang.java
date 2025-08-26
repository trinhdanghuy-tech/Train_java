package javaontap.Lab5.arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng thí sinh muốn nhập: ");
        int a = sc.nextInt();
        ArrayList arr = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            System.out.print("Xin mời nhập thí sinh thứ " + i + '\n');
            arr.add(sc.nextLine());

        }
    }

}
