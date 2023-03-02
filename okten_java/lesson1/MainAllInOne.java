package okten_java.lesson1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainAllInOne {
    public static void main(String[] args) {

       Car car = new Car("BMW", 2.0, 250, true);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(car));


        Book book = new Book("Captains Grant Children", 358, "Adventure");
        book.authors[0] = "Scott";
        book.authors[1] = "Duma";
        book.authors[2] = "Markes";
//        System.out.println("Authors of books \n{" + "\n" + book.authors[0] + "\n" + book.authors[1] + "\n" + book.authors[2]
//                + "\nName of the book is "
//                + book.title + "\nAmount of pages are " + book.pages + "\nGenre is " + book.genre + "\n}");
        System.out.println(gson.toJson(book));


        Dog dog = new Dog("Tuzik", 45, "Rezenshnautzer");
        System.out.println(gson.toJson(dog));
    }
}
