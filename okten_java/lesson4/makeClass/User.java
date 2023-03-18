package okten_java.lesson4.makeClass;

public class User {
    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    Skills skills;
    Cars cars;

    public User(int id, String name, String surname, String email, int age, Gender gender, Skills skills, Cars cars) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "{" +
                "\nid: " + id +
                "\nname: " + name +
                "\nsurname: " + surname +
                "\nemail: " + email +
                "\nage: " + age +
                "\ngender: " + gender +
                "\nskills: {" +
                "\ntitle: " + skills.course + ", " +
                "\nexp: " + skills.exp +
                "\ntitle: " + skills.course1 + ", " +
                "\nexp: " + skills.exp1 +
                "\ntitle: " + skills.course2 + ", " +
                "\nexp: " + skills.exp2 +
                "\ncars: " + cars.model +
                "\ncars: " + cars.power +
                "\ncars: " + cars.year + "\n}";

    }
    //        {
//            id: 1,
//                    name: 'vasya',
//                surname: 'pupkin',
//                email: 'asd@asd.com',
//                age: 31,
//                gender: 'MALE',

//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
}
