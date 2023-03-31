package Lesson1;

public class Book {
    private Author author;
    private String bookName;
    private int publishingYear;
    public Book(Author author, String bookName, int publishingYear){
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName(){
        return this.author;
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

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b2 = (Book) other;
        return bookName.equals(b2.bookName) && author.equals(b2.author);
    }


    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName,author,publishingYear);
    }
    @Override
    public String toString() {
        return "Имя автора книги - " + this.author + "; " + "Название книги - " + this.bookName + "; ";
    }

}
