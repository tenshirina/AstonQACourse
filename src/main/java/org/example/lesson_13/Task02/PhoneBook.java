package org.example.lesson_13.Task02;

import java.util.*;

class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void add(String lastName, String phoneNumber) {
        Contact contact = findContact(lastName);

        if (contact == null) {
            contact = new Contact(lastName);
            contacts.add(contact);
        }
        contact.addPhoneNumber(phoneNumber);
    }

    public List<String> get(String lastName) {
        Contact contact = findContact(lastName);

        if (contact != null) {
            return contact.getPhoneNumbers();
        }
        return new ArrayList<>();
    }

    private Contact findContact(String lastName) {
        for (Contact contact : contacts) {
            if (contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public void printAll() {
        for (Contact contact : contacts) {
            System.out.println("Фамилия: " + contact.getLastName() + " -> Телефоны: " + contact.getPhoneNumbers());
        }
    }
}
