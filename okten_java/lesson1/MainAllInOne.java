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

        Post post = new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio " +
                "reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit " +
                "molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        System.out.println(post);

        Comment comment = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\nntempora quo necessitatibus\\" +
                        "ndolor quam autem quasi\nnreiciendis et nam sapiente accusantium");
        System.out.println(comment);
    }
}
