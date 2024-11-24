package javaontap.Lab1;
import java.util.Scanner;

public class Lab1Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh 1: ");
        double canh1 = sc.nextInt();
        double thetich = Math.pow(canh1, 3);
        System.out.println("The tich la: " +thetich);
    }

}
