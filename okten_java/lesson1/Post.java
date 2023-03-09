package okten_java.lesson1;

public class Post {
    int userId;
    int id;
    String title;
    String body;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    @Override
    public String toString(){
        return "Post \n{" +
                "\n'userId':" + userId + "," +
                "\n'id':" + id + "," +
                "\n'title':" + title + "," +
                "\n'body':" + body + "\n}";
    }
}
