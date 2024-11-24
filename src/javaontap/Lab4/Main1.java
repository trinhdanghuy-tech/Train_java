package javaontap.Lab4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter student name: ");
        s1.setName(sc.nextLine());
        System.out.println("Enter student age: ");
        s1.setAge(sc.nextInt());
        System.out.println("Enter student gender: ");
        s1.setPoint(sc.nextDouble());
        s1.xuatThongTin(s1);

    }
}
