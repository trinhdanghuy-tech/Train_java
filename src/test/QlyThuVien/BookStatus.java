package test.QlyThuVien;

public enum BookStatus {
    AVAILABLE("Có sẵn"),
    BORROWED("Đã mượn"),
    REVERSED("Đã đặt trước");
    private final String description;

    BookStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
