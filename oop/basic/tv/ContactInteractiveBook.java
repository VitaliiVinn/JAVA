package oop.basic.tv;

import java.util.Scanner;

public class ContactInteractiveBook {
    private Contact[] contacts = new Contact[5];
    private int freePosition;
    private Scanner scanner = new Scanner(System.in);

    public ContactInteractiveBook() {
        menu();
    }
    private void addContact() {
        System.out.println("Enter phone");
        String phone = scanner.next();
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(phone)) {
                System.out.println("This data has been repeated");
                return;
            }
        }
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter email");
        String email = scanner.next();
        Contact contact = new Contact(name, surname, phone, email);
        contacts[freePosition++] = contact;
        System.out.println("Contact has been added");
        if (freePosition == contacts.length) {
            Contact[] updatedContacts = new Contact[contacts.length + 3];
            System.arraycopy(contacts, 0, updatedContacts, 0, contacts.length);
            contacts = updatedContacts;
        }
    }
    private void findContact() {
        System.out.println("Enter phone number to find");
        String findNumber = scanner.next();
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(findNumber)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar data");
    }
    private void removeContact() {
        System.out.println("Enter contact to remove it");
        String removePhone = scanner.next();
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(removePhone)) {
                System.arraycopy(contacts, i + 1, contacts, i, freePosition - i - 1);
                freePosition--;
                System.out.println("Contact with phone number " + removePhone + " has been deleted");
                return;
            }
        }
        System.out.println("Contact was not found");
    }
    private void updateContact() {
        System.out.println("Enter contact which you want to change");
        String enterExistingContact = scanner.next();
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getPhone().equals(enterExistingContact)) {
                System.out.println("What do you want to change: 1 - change phone number\n2 - change email\n3 - " +
                        "change name\n4 - change surname");
                int choiceToUpdateContact = scanner.nextInt();
                contacts[i].info();
                if (choiceToUpdateContact == 1) {
                    System.out.println("Enter new phone number");
                    String newPhoneNumber = scanner.next();
                    contacts[i].setPhone(newPhoneNumber);
                    return;
                }
                if (choiceToUpdateContact == 2) {
                    System.out.println("Enter new email");
                    String newEmail = scanner.next();
                    contacts[i].setPhone(newEmail);
                    return;
                }
                if (choiceToUpdateContact == 3) {
                    System.out.println("Enter new name");
                    String newName = scanner.next();
                    contacts[i].setPhone(newName);
                    return;
                }
                if (choiceToUpdateContact == 4) {
                    System.out.println("Enter new surname");
                    String newSurname = scanner.next();
                    contacts[i].setPhone(newSurname);
                    return;
                }
            }
        }
        System.out.println("Contact has not been found");
    }

    private void findSurname() {
        System.out.println("Enter surname to find contact");
        String existingSuchSurname = scanner.next();
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getSurname().equals(existingSuchSurname)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar surname");
    }

    private void findName() {
        System.out.println("Enter name to find contact");
        String existingSuchName = scanner.next();
        for (int i = 0; i < freePosition; i++) {
            if (contacts[i].getName().equals(existingSuchName)) {
                contacts[i].info();
                return;
            }
        }
        System.out.println("There is no similar name");
    }
     private void exit() {
        System.out.println("Do you really want to exit from menu?\n1 - Yes\n2 - No");
        int exitChoice = scanner.nextInt();
        if (exitChoice == 1) {
            System.out.println("The end");
        }
        else {
            System.out.println("To be continued");
        }
    }
    private void menu() {
        System.out.println("1 - add contact\n2 - remove contact\n3 - update contact\n4 - find contact\n" +
                "5 - find contact by surname\n6 - find contact by name\n7 - exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            addContact();
        }
        if (choice == 2) {
            removeContact();
        }
        if (choice == 3) {
            updateContact();
        }
        if (choice == 4) {
            findContact();
        }
        if (choice == 5) {
            findSurname();
        }
        if (choice == 6) {
            findName();
        }
        if (choice == 7) {
            System.exit(0);
        }
        menu();
    }
}
