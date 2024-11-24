package javaontap.Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu:");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            System.out.printf("Nhap so luong phan tu %d: ",i);
            array[i] = sc.nextInt();
        }
        System.out.println("Mang ban dau " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep " + Arrays.toString(array));
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("max " + max + " min " + min);
    }
}
