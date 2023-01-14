package automationJava.homework6;

public class Child extends Person{
    private String car;
    public Child (String name, String surname, String city, String phoneNumber, String car){
        super(name, surname, city, phoneNumber);
        this.car = car;
    }
    public String call(String name, String surname, String city, String phoneNumber){
        return super.call(name, surname, city, phoneNumber) + " з авто " + car;
    }
}
