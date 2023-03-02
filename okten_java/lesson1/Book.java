package okten_java.lesson1;

public class Book {
    String title;
    int pages;
    String[] authors = new String[3];
    String genre;

    public Book(String title, int pages, String genre){
        this.title = title;
        this.pages = pages;
        this.genre = genre;
    }

}
