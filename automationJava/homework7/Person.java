package automationJava.homework7;

public class Person {

    //    Також  написати класс Person який буде виконувати деякі дії, в нього має бути що найменше дві реалізації.
//    Написати свою власну помилку, яка буде винікати в результаті дій классу Person, також на ваш розсуд
//    Методи, Ієрархію класів робити на свій розсуд.
    private Contact[] contacts = new Contact[5];
    private int freePosition;

    public void addContact(Contact contact) throws ContactAlreadyDefinedException {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhoneNumber().equals(contact.getPhoneNumber())) {
                throw new ContactAlreadyDefinedException("Contact exsists");
            }
        }
        contacts[freePosition++] = contact;
        if (freePosition == contacts.length) {
            Contact[] updatedContacts = new Contact[contacts.length + 3];
            System.arraycopy(contacts, 0, updatedContacts, 0, contacts.length);
            contacts = updatedContacts;
        }
    }

    public void findContact(String phoneNumber) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhoneNumber().equals(phoneNumber)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar data");
    }

    public void removeContact(String phoneNumber) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhoneNumber().equals(phoneNumber)) {
                System.arraycopy(contacts, i + 1, contacts, i, freePosition - i - 1);
                freePosition--;
                System.out.println("Contact with phone number " + phoneNumber + " has been deleted");
                return;
            }
        }
        System.out.println("Contact was not found");
    }

    public void updateContact(Contact contact, String contactPhone) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhoneNumber().equals(contactPhone)) {
                contacts[i].setName(contact.getName());
                contacts[i].info();
                return;
            }
        }
    }
}
