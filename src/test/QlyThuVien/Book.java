package test.QlyThuVien;

import java.time.LocalDate;

public class Book extends LibraryItem {
    private String author;

    public Book(String author, String title, LocalDate publishDate, BookStatus status) {
        super(title, publishDate, status);
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        this.author = author; }

    @Override
    public void getDetails() {
        System.out.println("Book: " + getTitle() + ", Author: " + getAuthor() + " Published: " + getPublishDate() + ", Status: " + getStatus().getDescription());
    }
}
