package org.example.lesson_6.Task01;

public class Animal {
    protected String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int distanceRun) {
        System.out.println("Животное пробежало" + distanceRun + " м.");
    }

    public void swim(int distanceSwim) {
        System.out.println("Животное проплыло" + distanceSwim + " м.");
    }

    public static void showCount() {
        System.out.println("Количество животных: " + count);
    }
}
