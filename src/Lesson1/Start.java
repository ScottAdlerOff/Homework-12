package Lesson1;

public class Start {
    public static void printSeparator(){
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        printSeparator();
        Author danSimmons = new Author("Дэн", "Симмонс");
        Book hyperion = new Book(danSimmons, "Гипперион", 1989);
        System.out.println("Имя автора - " + danSimmons);
        System.out.println(hyperion + " Год публикации - " + hyperion.getPublishingYear());
        hyperion.setPublishingYear(1988);
        System.out.println(hyperion + " Год публикации - " + hyperion.getPublishingYear());
        printSeparator();
        Author rayBradbury = new Author("Рэй", "Брэдбери");
        Book fahrenheit451 = new Book(rayBradbury, "451 градус по Фаренгейту", 1953);
        System.out.println("Имя автора - " + rayBradbury);
        System.out.println(fahrenheit451 + " Год публикации - " + fahrenheit451.getPublishingYear());
        printSeparator();

    }
}
