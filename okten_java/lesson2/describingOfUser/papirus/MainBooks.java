package okten_java.lesson2.describingOfUser.papirus;

public class MainBooks {
    public static void main(String[] args) {
        Book book = new Book(500, true, true, "Moroz");
        System.out.println(book);

        Comics comics = new Comics(250, false, true, "Clown", "Superman");
        System.out.println(comics);

        Magazine magazine = new Magazine(157, true, true, "Fitness", "Health");
        System.out.println(magazine);
    }
}
