package test.quanlysanpham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySoLuong quanLySoLuong = new QuanLySoLuong();
        Scanner sc = new Scanner(System.in);

        quanLySoLuong.loadFromFile("sanpham.txt");

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị danh sách sản phẩm.");
            System.out.println("3. Tìm sản phẩm theo mã sản phẩm.");
            System.out.println("4. Xóa sản phẩm theo ID");
            System.out.println("5. Sắp xếp theo tên");
            System.out.println("6. Lưu vào file");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");


            int choice;
            try{
                choice = Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số!");
                continue;
            }
            switch (choice) {
                case 1:
                    try{
                        System.out.println("Nhập mã sản phẩm: ");
                        int maSP = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập tên sản phẩm: ");
                        String tenSp = sc.nextLine();
                        System.out.println("Nhập giá thành: ");
                        double giaThanh = Double.parseDouble(sc.nextLine());
                        System.out.println("Nhập số lượng sản phẩm: ");
                        int soLuongSP = Integer.parseInt(sc.nextLine());

                        Sanpham sp = new Sanpham(maSP, tenSp, giaThanh, soLuongSP);
                        System.out.println("Đã thêm sản phẩm");
                        quanLySoLuong.themSP(sp);
                    } catch (Exception e){
                        System.out.println("Nhập dữ liệu sai vui lòng nhập lại!");
                    }
                    break;
                case 2:
                    quanLySoLuong.hienThiSP();
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm muốn tìm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    quanLySoLuong.timSPTheoID(id);
                    break;
                case 4:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    int id1 = Integer.parseInt(sc.nextLine());
                    quanLySoLuong.xoaSPtheoID(id1);
                    break;
                case 5:
                    quanLySoLuong.xepTheoTen();
                    break;
                case 6:
                    quanLySoLuong.saveToFile("sanpham.txt");
                    break;
                case 7:
                    quanLySoLuong.saveToFile("sanpham.txt");
                    System.out.println("Thoát chương trình...");
                    return;
                default:
                    System.out.println("Chọn sai, vui lòng nhập 1-7.");
            }
        }
    }
}
