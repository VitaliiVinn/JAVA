package okten_java.lesson2.describingOfUser;

public class User {
//    {
//        "id": 1,
//            "name": "Leanne Graham",
//            "username": "Bret",
//            "email": "Sincere@april.biz",
//            "address": {
//        "street": "Kulas Light",
//                "suite": "Apt. 556",
//                "city": "Gwenborough",
//                "zipcode": "92998-3874",
//                "geo": {
//            "lat": "-37.3159",
//                    "lng": "81.1496"
//        }
private int id;
private String name;
private String userName;
private String email;

Address address;
public User(int id, String name, String userName, String email, Address address){
    this.id = id;
    this.name = name;
    this.userName = userName;
    this.email = email;
    this.address = address;
}
@Override
public String toString(){
    return "{" +
            "\n'ID':" + id + "," +
            "\n'name':" + name + "," +
            "\n'userName':" + userName + "," +
            "\n'email':" + email + "," +
            "\n'address': {" +
            "\n'street':" + address.street +
            "\n'suite':" + address.suite +
            "\n'city':" + address.city +
            "\n'zipcode':" + address.zip +
            "\n'geo': {" +
            "\n'lat':" + address.geo.lat +
            "\n'lng':" + address.geo.lng + "\n}";
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public static void getAddress() {
//        return address;
//    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
