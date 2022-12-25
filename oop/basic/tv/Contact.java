package oop.basic.tv;

public class Contact {
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Contact(String name, String surname, String phone, String email){
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

    public void info(){
        System.out.println("Name: " + name + ", Surname: " + surname + ", Phone: " + phone + ", Email: "
                + email);
    }

    public void setPhone(String newPhone){
    this.phone = newPhone;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
