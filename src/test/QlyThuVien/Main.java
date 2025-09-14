package test.QlyThuVien;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Book empBook = new Book("Vũ Khắc Việt", "Machine Learning" , LocalDate.of(2023,1,20), BookStatus.AVAILABLE);
        empBook.getDetails();
        Magazine mnzs1 = new Magazine("Báo cáo khoa học", LocalDate.of(2025, 8, 27), BookStatus.BORROWED, 1);
        mnzs1.getDetails();


        //Tạo Loan
        LocalDateTime borrowDate = LocalDateTime.of(2025, 8, 20, 10, 0);
        LocalDateTime returnDate = LocalDateTime.of(2025, 8, 26, 10, 0);
        LibraryItem.Loan loan = new LibraryItem.Loan(empBook, borrowDate, returnDate);
        System.out.println("Tien phạt: $" + loan.calculateFine() );
    }
}
