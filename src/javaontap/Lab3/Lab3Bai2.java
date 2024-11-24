package javaontap.Lab3;

import java.util.Scanner;

public class Lab3Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.printf(" %d x %d = %d\n", i, x, x* i);
            System.out.printf("\n");
        }
        sc.close();
    }
}
