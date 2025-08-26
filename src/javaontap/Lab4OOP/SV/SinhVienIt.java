package javaontap.Lab4OOP.SV;

// Lớp con IT
class SinhVienIT extends SinhVien {
    String language;

    // Constructor không tham số
    public SinhVienIT() {
        super(); // gọi constructor của cha
    }

    // Có thể override getPriceTax nếu muốn thay đổi logic
    @Override
    public double getPriceTax() {
        System.out.println("Tính học phí cho SinhVienIT");
        return super.getPriceTax(); // vẫn dùng công thức của cha
    }
}

