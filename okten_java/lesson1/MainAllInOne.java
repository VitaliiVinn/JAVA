package okten_java.lesson1;

public class MainAllInOne {
    public static void main(String[] args) {
       Car car = new Car("BMW", 2.0, 250, true);
        System.out.println(car);


        Book book = new Book("'Captain's Grant Children'", 358, "Adventure");
        book.authors[0] = "Scott";
        book.authors[1] = "Duma";
        book.authors[2] = "Markes";
        System.out.println("Authors of books \n{" + "\n" + book.authors[0] + "\n" + book.authors[1] + "\n" + book.authors[2]
                + "\nName of the book is "
                + book.title + "\nAmount of pages are " + book.pages + "\nGenre is " + book.genre + "\n}");


        Dog dog = new Dog("Tuzik", 45, "Rezenshnautzer");
//        dog.infoAboutDog();
        System.out.println(dog);
    }
}
