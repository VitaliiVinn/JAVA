package automationJava.homework6;

public interface Callable {
    String call(String name, String surname, String city, String phoneNumber);

    String call(Person person);
}
