package okten_java.lesson1;

public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public void infoAboutDog(){
        System.out.println(name + ", " + age + ", " + breed);
    }
}
