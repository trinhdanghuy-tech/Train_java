package test.QuanLySinhVien;

import java.io.*;
import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    // Thêm sinh viên
    public void addStudent(Student s) {
        students.add(s);
    }

    // Hiển thị danh sách
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Tìm theo tên
    public void searchByName(String keyword) {
        boolean found = false;
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sinh viên.");
    }

    // Xóa theo ID
    public void deleteById(int id) {
        Student toRemove = null;
        for (Student s : students) {
            if (s.getId() == id) {
                toRemove = s;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Đã xóa sinh viên có ID " + id);
        } else {
            System.out.println("Không tìm thấy ID này.");
        }
    }

    // Sắp xếp theo tên
    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Đã sắp xếp theo tên.");
    }

    // Sắp xếp theo GPA giảm dần
    public void sortByGpa() {
        students.sort((a, b) -> Double.compare(b.getGpa(), a.getGpa()));
        System.out.println("Đã sắp xếp theo GPA.");
    }

    // Ghi file
    public void saveToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Student s : students) {
                bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getGpa() + "," + s.getMajor());
                bw.newLine();
            }
            System.out.println("Đã lưu vào file " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc file
    public void loadFromFile(String filename) {
        students.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                if (arr.length == 5) {
                    int id = Integer.parseInt(arr[0]);
                    String name = arr[1];
                    int age = Integer.parseInt(arr[2]);
                    double gpa = Double.parseDouble(arr[3]);
                    String major = arr[4];
                    students.add(new Student(id, name, age, gpa, major));
                }
            }
            System.out.println("Đã load dữ liệu từ file.");
        } catch (IOException e) {
            System.out.println("Không tìm thấy file, bắt đầu danh sách trống.");
        }
    }
}
