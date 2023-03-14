package okten_java.lesson4.zooclub;

public class Person {
    private String owner;

    public Person(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Person{" +
                "owner='" + owner + '\'' +
                '}';
    }
}
