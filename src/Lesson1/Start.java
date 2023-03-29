package Lesson1;

public class Start {
    public static void printSeparator(){
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        printSeparator();
        Author danSimmons = new Author("Дэн", "Симмонс");
        Book hyperion = new Book(danSimmons, "Гипперион", 1989);
        System.out.println("Имя автора - " + danSimmons.getFirstName() + " " + danSimmons.getSecondNameName());
        System.out.println("Имя автора книги - " + hyperion.getAuthorName() + "; Название книги - " + hyperion.getBookName() + "; Год публикации - " + hyperion.getPublishingYear());
        hyperion.setPublishingYear(1988); // Год не верный, просто для испытания Сеттера сделано:)
        System.out.println("Имя автора книги - " + hyperion.getAuthorName() + "; Название книги - " + hyperion.getBookName() + "; Год публикации - " + hyperion.getPublishingYear());
        printSeparator();
        Author rayBradbury = new Author("Рэй", "Брэдбери");
        Book fahrenheit451 = new Book(rayBradbury, "451 градус по Фаренгейту", 1953);
        System.out.println("Имя автора - " + rayBradbury.getFirstName() + " " + rayBradbury.getSecondNameName());
        System.out.println("Имя автора книги - " + fahrenheit451.getAuthorName() + "; Название книги - " + fahrenheit451.getBookName() + "; Год публикации - " + fahrenheit451.getPublishingYear());
        printSeparator();

    }
}
