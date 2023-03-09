package okten_java.lesson2.describingOfUser.papirus;

public class Magazine extends Book {
    String magazineName;

    public Magazine(int amountOfPages, boolean paper, boolean pictures, String publisher, String magazineName) {
        super(amountOfPages, paper, pictures, publisher);
        this.magazineName = magazineName;
    }

    @Override
    public String toString() {
        return "Magazine {" +
                "\n'magazineName': " + magazineName + "\n}" + super.toString();
    }
}
