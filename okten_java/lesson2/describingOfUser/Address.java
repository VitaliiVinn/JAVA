package okten_java.lesson2.describingOfUser;

public class Address {
    String street;
    String suite;
    String city;
    String zip;
    Geo geo;


    public Address(String street, String suite, String city, String zip, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zip = zip;
        this.geo = geo;
    }
}
