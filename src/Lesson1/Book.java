package Lesson1;

public class Book {
    String authorName;
    String bookName;
    int publishingYear;
    public Book(String authorName, String bookName, int publishingYear){
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthorName(){
        return this.authorName;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }
}
