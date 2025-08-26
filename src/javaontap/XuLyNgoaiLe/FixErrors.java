package javaontap.XuLyNgoaiLe;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FixErrors {
    public void validateEmail(String email) {
        try {
            if (!email.contains("@")) {
                throw new IllegalArgumentException("Email không hợp lệ");
            }
            System.out.println("Email hợp lệ: " + email);
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        finally {
            System.out.println("Nhap lai de");
        }
    }
    public static void main(String[] args) {
        String email = "huyshaisahi";
        try {
            FileReader file = new FileReader("non_existent_file.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("Tệp không tồn tại: " + e.getMessage());
        }
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Truy cap ngoai gioi han mang: " + e.getMessage());
        }


    }
}
