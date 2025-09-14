package test.QlyThuVien;

import java.time.LocalDate;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, LocalDate publishDate, BookStatus status,int issueNumber) {
        super(title, publishDate, status);
        this.issueNumber = issueNumber;
    }
    public int getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(int issueNumber) {
        if(issueNumber < 1 || issueNumber > 100){
            throw new IllegalArgumentException("Issue number must be between 1 and 100");
        }
        this.issueNumber = issueNumber;
    }

    @Override
    public void getDetails() {
        System.out.println("Title: " + getTitle() + " IssueNumber: " + getIssueNumber() + " Published: " + getPublishDate() +" Status: " + getStatus().getDescription() );
    }
}
