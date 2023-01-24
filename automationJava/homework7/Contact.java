package automationJava.homework7;

public class Contact {
    private String name;
    private String phoneNumber;
    private String surname;

    public Contact(String name, String surname, String phoneNumber){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getPhoneNumber() {return phoneNumber;}

    public void info(){
        System.out.println("Name: " + name + ", Surname: " + surname + ", Phone: " + phoneNumber);
    }

    public void setPhoneNumber(String newPhone){
        this.phoneNumber = newPhone;
    }
    public void setName (String newName){
        this.name = newName;
    }

}
