package okten_java.lesson2.describingOfUser.papirus;

public class Comics extends Book {
    String comicsName;

    public Comics(int amountOfPages, boolean paper, boolean pictures, String publisher, String comicsName) {
        super(amountOfPages, paper, pictures, publisher);
        this.comicsName = comicsName;
    }

    @Override
    public String toString() {
        return "Comics {" +
                "\n'comicsName': " + comicsName + "\n}" + super.toString();
    }
}
