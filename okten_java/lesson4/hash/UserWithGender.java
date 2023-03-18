package okten_java.lesson4.hash;

import java.util.HashSet;

public class UserWithGender {
    private String name;
    private String sex;

    public UserWithGender(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' +
                ", sex = " + sex;
    }
}
