package test.quanlybanhang;

import java.util.ArrayList;
import java.util.Date;

public class Invoice extends Product{
    private int maDonHang;
    private Date date;
    ArrayList<Product> products = new ArrayList<>();
    private int total;

    public Invoice(int id, String tenSp, double price, int quantity,int maDonHang, Date date, int total) {
        super(id, tenSp, price, quantity);
        this.maDonHang = maDonHang;
        this.date = date;
        this.total = total;
    }
    public int getMaDonHang() {return maDonHang;}

    public Date getDate() {return date;}

    public int getTotal() {return total;}

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMaDonHang(int maDonHang) {
        this.maDonHang = maDonHang;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    //Thêm sản phầm
    public void addProduct(Product product) {
        products.add(product);
    }

    // Hiển thị danh sac sản phẩm

    public void displayProducts() {
        if (products.isEmpty()){
            System.out.println("Danh sách sản phẩm trống");
        }
        for (Product p : products) {
            System.out.println(p);
        }
    }
    //Tìm sản phẩm theo id
    public void searchProducts(int id) {
        boolean found = false;
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
    //Xóa sản phẩm theo id
    public void removeProduct(int id) {
        Product toRemove = null;
        for (Product p : products) {
            if (p.getId() == id) {
                toRemove = p;
                break;
            }
        }
        if (toRemove != null) {
            products.remove(toRemove);
            System.out.println("Đã xóa sản phẩm có id là: " + id);
        }
        else {
            System.out.println("Không tìm thấy id này");
        }
    }
}
