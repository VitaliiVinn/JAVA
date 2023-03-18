package okten_java.lesson4.sortList;

import lombok.Getter;
import lombok.Setter;
import okten_java.lesson2.describingOfUser.User;


@Setter
public class Users implements Comparable<Users>{
    private String name;
    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", age = " + age;
    }
    @Override
    public int compareTo(Users e){
        return this.getAge() - e.getAge();
    }

}
