package oop.basic.tv;

public class MainAddressBook {
    public static void main(String[] args) {
        AddressBook cellphone = new AddressBook();
        Contact contact = new Contact("Vasya", "Ivanov", "+380675316444", "vasya@gmail.com");
        cellphone.addContact(contact);
        contact = new Contact("Petya", "Petrov", "+380508123654", "petr@gmail.com");
        cellphone.addContact(contact);
        contact = new Contact("Tanya", "Karol", "+380678881122", "tana@gmail.com");
        cellphone.addContact(contact);
        contact = new Contact("Petya", "Petrov", "+380508123654", "petr@gmail.com");
        cellphone.addContact(contact);
        System.out.println();
        contact = new Contact("Kirill", "Kirillov", "+380935443321", "kir@gmail.com");
        cellphone.addContact(contact);
        contact = new Contact("Fedya", "Fedorov", "+380970236841", "fedor@gmail.com");
        cellphone.addContact(contact);
        contact = new Contact("Liza", "Loza", "+380442223648", "liza@gmail.com");
        cellphone.addContact(contact);
        contact = new Contact("Boris", "Johnson", "+380503013648", "borik@gmail.com");
        cellphone.addContact(contact);
        System.out.println();
        cellphone.findContact("+380453013648");
        System.out.println();
        cellphone.removeContact("+380970236841");
        cellphone.findContact("+380970236841");
        System.out.println();
        cellphone.findContact("+380503013648");

        contact.setName("Barak");
        cellphone.updateContact(contact, "+380503013648");

        cellphone.findName("Liza");
        cellphone.findSurname("Johnson");



    }
}
