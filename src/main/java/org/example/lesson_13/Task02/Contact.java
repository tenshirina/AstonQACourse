package org.example.lesson_13.Task02;

import java.util.*;

class Contact {
    private String lastName;
    private List<String> phoneNumbers;

    public Contact(String lastName) {
        this.lastName = lastName;
        this.phoneNumbers = new ArrayList<>();
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
