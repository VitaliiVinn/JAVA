package automationJava.homework6;

public class MainPerson {
    public static void main(String[] args) {
        Person somePerson = new Person("Arnold", "Schwarzenegger", "LA", "554562218651" );
        String call1 = somePerson.call("Will", "Smith", "New York", "313131313");
        String call2 = somePerson.call("Jackie", "Chan", "Shanghai", "12312412412");
        String call3 = somePerson.call("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(call1);
        System.out.println(call2);
        System.out.println(call3);

        Person person = new Person("Will", "Smith", "New York", "313131313");
        String call4 = person.call(new Person("Sherlock", "Holmes", "London", "37742123513"));
        String call5 = somePerson.call(new Person("Jackie", "Chan", "Shanghai", "12312412412"));
        String call6 = somePerson.call(person);
        String call7 = somePerson.call(somePerson);
        System.out.println(call4);
        System.out.println(call5);
        System.out.println(call6);
        System.out.println(call7);

        Child child = new Child("Kolya", "Vasechkin", "Lvov", "5611931323", "Mercedes");
        System.out.println(child.call("Will", "Smith", "New York", "313131313"));
    }
}
