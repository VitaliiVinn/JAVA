package okten_java.lesson3.defineInterface.classBook;

import okten_java.lesson3.defineInterface.Printable;

public class Book implements Printable {
    String author;
    String mainPerson;

    public Book(String author, String mainPerson) {
        this.author = author;
        this.mainPerson = mainPerson;
    }

    @Override
    public void print() {
        System.out.println("\nThe book from " + author + " with main hero " + mainPerson);
    }
    @Override
    public String toString(){
        return author + ", " + mainPerson;
    }
}
