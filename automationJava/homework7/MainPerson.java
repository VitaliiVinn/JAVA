package automationJava.homework7;

public class MainPerson {
    public static void main(String[] args) {

        Person callForPerson = new Person();
        Contact contact = new Contact("Isaak", "Newton", "+38067512364");
        try {
            callForPerson.addContact(contact);
        }
        catch (ContactAlreadyDefinedException e){
            e.printStackTrace();
            System.out.println("Added successfully");
        }
        contact = new Contact("Fedor", "Shmelev", "+380503521225");
        try {
            callForPerson.addContact(contact);
        }
        catch (ContactAlreadyDefinedException e){
            e.printStackTrace();
            System.out.println("Added successfully");

        }
        callForPerson.findContact("+38067512364");
        callForPerson.removeContact("+38067512364");
        contact.setName("Jimmy");
        callForPerson.updateContact(contact, "+380503521225");
    }

}
