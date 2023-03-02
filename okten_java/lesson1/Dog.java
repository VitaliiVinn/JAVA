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

    @Override
    public String toString() {
        return "Dog describing\n{" +
                "\nname is " + name +
                "\nhis age is " + age +
                "\nbreed is " + breed + "\n}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
