package javaontap.Lab3;

import java.util.Scanner;

public class Lab3Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int value = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= value - 1; i++) {
            if (value % i == 0) {
                System.out.println("Uoc so khac " + i);
                count++;
            }
        }
        if ( count == 0 ) {
            System.out.printf("%d la so nguyen to", value);

        }
        else {
            System.out.printf("%d khong la so nguyen to ", value);
        }
        sc.close();
    }
}
