package okten_java.lesson2.describingOfUser.additional;

import java.util.ArrayList;

public class Posts {
    int userId;
    int id;
    String title;
    String body;
    private ArrayList<Comments> comments;

    public ArrayList<Comments> getComments() {
        return comments;
    }

    public Posts(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int idPost) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    @Override
    public String toString(){
        return userId + ", " + id + ", " + title + ", "  + body + ", " + comments;
    }
}
