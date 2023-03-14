package okten_java.lesson4.zooclub;

public class Pet {
    private String animal;

    public Pet(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "animal='" + animal + '\'' +
                '}';
    }
}
