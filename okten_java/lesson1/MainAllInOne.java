package okten_java.lesson1;

public class MainAllInOne {
    public static void main(String[] args) {
       Car car = new Car("BMW", 2.0, 250, true);
        System.out.println(car);


        Book book = new Book("Captain's Grant Children", 358, "Adventure");
        book.authors[0] = "Scott";
        book.authors[1] = "Duma";
        book.authors[2] = "Markes";
        System.out.println(book.authors[0] + ", " + book.authors[1] + ", " + book.authors[2] + ", "
                + book.title + ", " + book.pages + ", " + book.genre);


        Dog dog = new Dog("Tuzik", 45, "Rezenshnautzer");
        dog.infoAboutDog();
    }
}
