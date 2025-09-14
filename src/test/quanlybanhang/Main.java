package test.quanlybanhang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Invoice invoice = new Invoice();*/
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n====== QUẢN LÝ BÁN HÀNG ======");
            System.out.println("1. Quản lý sản phẩm");
            System.out.println("   1.1. Thêm sản phẩm.");
            System.out.println("   1.2. Hiển thị thông tin sản phẩm.");
            System.out.println("   1.3. Tìm kiếm sản phẩm theo id.");
            System.out.println("   1.4. Xóa sản phẩm.");
            System.out.println("2. Bán hàng(Tạo hóa đơn).");
            System.out.println("3. Xem doanh thu");
            System.out.println("4. Thoát");
            System.out.println("===========================");
            System.out.println("Chọn: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số");
                continue;
            }
            switch (choice) {
                case 1:
                    try{
                        System.out.println("Nhập mã sản phẩm: ");
                        int id = sc.nextInt();
                        System.out.println("Nhập tên sản phẩm: ");
                        String tenSP = sc.nextLine();
                        System.out.println("Giá thành: ");
                        int price = sc.nextInt();
                        System.out.println("Số lượng: ");
                        int quantity = sc.nextInt();

                        Product p = new Product(id, tenSP, price, quantity);
                        /*invoice.addProduct(p);*/
                        System.out.println("Đã thêm sản phẩm!");
                    }catch (Exception e) {
                        System.out.println("Nhập dữ liệu sai vui lòng làm lại");
                    }
            }
        }
    }
}
