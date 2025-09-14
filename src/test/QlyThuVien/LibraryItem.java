package test.QlyThuVien;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class LibraryItem {
    private String title;
    public LocalDate publishDate;
    private BookStatus status;

    public LibraryItem(String title, LocalDate publishDate, BookStatus status) {
        this.title = title;
        this.publishDate = publishDate;
        this.status = status;
    }

    public String getTitle() {return title;}

    public LocalDate getPublishDate() {return publishDate;}

    public BookStatus getStatus() {return status;}

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setPublishDate(LocalDate publishDate) {
        if(publishDate == null) {
            throw new IllegalArgumentException("Pushlish date cannot be null"); }
        this.publishDate = publishDate;}

    public void setStatus(BookStatus status) {
        if(status == null) { throw new IllegalArgumentException("BookStatus cannot be null"); }
        this.status = status;}

    public abstract void getDetails();

    public static class Loan{
        LibraryItem item;
        LocalDateTime borrowDate;
        LocalDateTime returnDate;

        public Loan(LibraryItem item, LocalDateTime borrowedDate, LocalDateTime returnedDate) {
            this.item = item;
            this.borrowDate = borrowedDate;
            this.returnDate = returnedDate;
        }
        public LibraryItem getItem() {return item;}

        public void setItem(LibraryItem item) {
            if(item == null) {
                throw new IllegalArgumentException("Item cannot be null"); }
            this.item = item;}

        public LocalDateTime getBorrowedDate() {return borrowDate;}

        public void setBorrowDate(LocalDateTime borrowDate) {
            if (borrowDate == null) {
                throw new IllegalArgumentException("Ngày mượn không được null");
            }
            this.borrowDate = borrowDate;
        }

        public LocalDateTime getReturnedDate() {return returnDate;}

        public void setReturnDate(LocalDateTime returnDate) {
            if (returnDate == null) {
                throw new IllegalArgumentException("Ngày trả không được null");
            }
            if (returnDate.isBefore(borrowDate)) {
                throw new IllegalArgumentException("Ngày trả phải sau ngày mượn");
            }
            this.returnDate = returnDate; // Sửa lỗi: Không cần parse
        }

        public double calculateFine() {
            LocalDateTime currentDate = LocalDateTime.now();
            if (currentDate.isAfter(returnDate)) {
                long daysLate = ChronoUnit.DAYS.between(returnDate, currentDate);
                return daysLate * 5.0; // Phạt 5 USD mỗi ngày trễ
            }
            return 0.0;
        }
    }

}
