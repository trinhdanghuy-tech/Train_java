package test.quanlybanhang;

public class Product {
    private int id;
    private String tenSp;
    private double price;
    private int quantity;

    public Product(int id, String tenSp, double price, int quantity) {
        this.id = id;
        this.tenSp = tenSp;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {return id;}

    public String getTenSp() {return tenSp;}

    public double getPrice() {return price;}

    public int getQuantity() {return quantity;}

    public void setId(int id) {
        if (id < 0){
            throw new IllegalArgumentException("Id sản phầm không thể âm.");
        }
        this.id = id;
    }

    public void setTenSp(String tenSp) {
        if (tenSp == null || tenSp.trim().isEmpty()){
            throw new IllegalArgumentException("Tên sản phầm không thể trống!");
        }
        this.tenSp = tenSp;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new IllegalArgumentException("Giá sản phẩm không thể âm.");
        }

        this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            throw new IllegalArgumentException("Số lượng sản phẩm không thể âm");
        }
        this.quantity = quantity;
    }

    public String toString(){
        return "Id sản phẩm: " + id + "\n"
                + "Tên sản phẩm: " + tenSp +"\n"
                + "Giá sản phầm: " + price + "\n"
                + "Số lượng: " + quantity;
    }

}
