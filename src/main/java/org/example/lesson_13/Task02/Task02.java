package org.example.lesson_13.Task02;

public class Task02 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Голимов", "+79523654551");
        phoneBook.add("Олина", "+79124781202");
        phoneBook.add("Большов", "+79365202148");
        phoneBook.add("Олина", "+79145682117");
        phoneBook.add("Большов", "+792571200478");

        System.out.println("Телефоны Олиновой: " + phoneBook.get("Олинова"));
        System.out.println("Телефоны Голимова: " + phoneBook.get("Голимов"));
        System.out.println("Телефоны Большова: " + phoneBook.get("Большов"));

        System.out.println("\nВсе записи в справочнике:");
        phoneBook.printAll();
    }
}
