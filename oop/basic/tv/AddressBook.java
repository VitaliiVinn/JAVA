package oop.basic.tv;

public class AddressBook {
    private Contact[] contacts = new Contact[5];
    private int freePosition;


    public void addContact(Contact contact) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(contact.getPhone())) {
                System.out.println("This data has been repeated");
                return;
            }
        }
        contacts[freePosition++] = contact;
        System.out.println("Contact has been added");
        if (freePosition == contacts.length) {
            Contact[] updatedContacts = new Contact[contacts.length + 3];
            System.arraycopy(contacts, 0, updatedContacts, 0, contacts.length);
            contacts = updatedContacts;
        }
    }

    public void findContact(String phoneNumber) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(phoneNumber)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar data");
    }

    public void removeContact(String phoneNumber) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(phoneNumber)) {
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
            if (contacts[i].getPhone().equals(contactPhone)) {
                contacts[i].setName(contact.getName());
                contacts[i].info();
                return;
            }
        }
    }

    public void findSurname(String surnameData) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getSurname().equals(surnameData)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar surname");
    }

    public void findName(String nameData) {
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getName().equals(nameData)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar name");

    }
}
