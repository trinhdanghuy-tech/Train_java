package test.quanlysanpham;

public class Sanpham {
    private String tenSp;
    private int maSP;
    private double giaThanh;
    private int soLuongSP;

    public Sanpham(int maSP, String tenSp,  double giaThanh, int soLuongSP) {
        this.tenSp = tenSp;
        this.maSP = maSP;
        this.giaThanh = giaThanh;
        this.soLuongSP = soLuongSP;
    }

    public String getTenSp() { return tenSp;}
    public int getMaSP() { return maSP; }
    public double getGiaThanh() { return giaThanh; }
    public int getSoLuongSP() { return soLuongSP; }

    public void setTenSp(String tenSp) {
        if(tenSp == null || tenSp.trim().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được để trống!");
        }
        this.tenSp = tenSp;
    }

    public void setMaSP(int maSP) {
        if(maSP < 0) {
            throw new IllegalArgumentException("Mã sản phẩm phải là số");
        }
        this.maSP = maSP;
    }

    public void setGiaThanh(double giaThanh) {
        if(giaThanh <= 0) {
            throw new IllegalArgumentException("Giá thành không hợp lệ!");
        }
        this.giaThanh = giaThanh;
    }

    public void setSoLuongSP(int soLuongSP) {
        if(soLuongSP < 0){
            throw new IllegalArgumentException("Số lượng sản phẩm không thể âm!");
        }
        this.soLuongSP = soLuongSP;
    }

    @Override
    public String toString() {
        return "{Mã sản phẩm: " + maSP + ", Tên sản phẩm:" + tenSp + ", Giá trên 1 sản phẩm: " + giaThanh + ", Số lượng sản phẩm: " + soLuongSP +" }";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Sanpham other = (Sanpham) obj;
        if (maSP != other.maSP){
            return false;
        }
        if (tenSp == null) {
            if (other.tenSp != null){}
        }
        else if (!tenSp.equals(other.tenSp)){
            return false;
        }
        if (giaThanh != other.giaThanh){
            return false;
        }
        return true;
    }

}
