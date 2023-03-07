package okten_java.lesson2.describingOfUser.papirus;

public class Book extends Papirus{
    String publisher;

    public Book(int amountOfPages, boolean paper, boolean pictures, String publisher) {
        super(amountOfPages, paper, pictures);
        this.publisher = publisher;
    }
    @Override
    public String toString(){
        return "\nBook \n{" +
                "\n'publisher': " + publisher + "\n}" + super.toString();

    }
}
