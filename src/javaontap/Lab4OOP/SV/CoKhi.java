package javaontap.Lab4OOP.SV;

// Lớp con Cơ Khí
class SinhVienCoKhi extends SinhVien {
    String skill;

    public SinhVienCoKhi() {
        super();
    }

    @Override
    public double getPriceTax() {
        System.out.println("Tính học phí cho SinhVienCoKhi");
        return super.getPriceTax();
    }
}