package okten_java.lesson3.defineInterface;

public class OfficePaper implements Printable{
    String name;
    int pages;

    public OfficePaper(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("Type is " + name + " with " + pages + " pages");
    }
}
