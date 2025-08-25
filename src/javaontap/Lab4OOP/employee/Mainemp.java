package javaontap.Lab4OOP.employee;

import java.util.Scanner;

public class Mainemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee();
        System.out.println("Xin mời nhập họ: ");
        emp1.setFirstName(sc.nextLine());
        System.out.println("Xin mời nhập tên: ");
        emp1.setLastName(sc.nextLine());
        System.out.println("Tuổi: ");
        emp1.setAge(sc.nextInt());
        System.out.println("Lương cơ bản: ");
        emp1.setSalary(sc.nextDouble());
        System.out.println("Số năm kinh nghiệm: ");
        emp1.setTimework(sc.nextInt());
        emp1.xuatThongTin(emp1);

    }
}
