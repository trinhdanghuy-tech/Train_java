package test.QuanLySinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        // Load dữ liệu từ file (nếu có)
        manager.loadFromFile("students.txt");

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm sinh viên theo tên");
            System.out.println("4. Xóa sinh viên theo ID");
            System.out.println("5. Sắp xếp theo tên");
            System.out.println("6. Sắp xếp theo GPA");
            System.out.println("7. Lưu vào file");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số!");
                continue;
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Nhập ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập tuổi: ");
                        int age = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập GPA: ");
                        double gpa = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhập ngành: ");
                        String major = sc.nextLine();

                        Student s = new Student(id, name, age, gpa, major);
                        manager.addStudent(s);
                        System.out.println("Đã thêm sinh viên!");
                    } catch (Exception e) {
                        System.out.println("Dữ liệu nhập sai, vui lòng thử lại.");
                    }
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;
                case 4:
                    System.out.print("Nhập ID cần xóa: ");
                    int id = Integer.parseInt(sc.nextLine());
                    manager.deleteById(id);
                    break;
                case 5:
                    manager.sortByName();
                    break;
                case 6:
                    manager.sortByGpa();
                    break;
                case 7:
                    manager.saveToFile("students.txt");
                    break;
                case 8:
                    manager.saveToFile("students.txt");
                    System.out.println("Thoát chương trình...");
                    return;
                default:
                    System.out.println("Chọn sai, vui lòng nhập 1-8.");
            }
        }
    }
}

