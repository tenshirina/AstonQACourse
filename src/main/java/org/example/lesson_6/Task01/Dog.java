package org.example.lesson_6.Task01;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static void showDogCount() {
        System.out.println("Количество собак: " + dogCount);
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun >= 0 && distanceRun <= 500) {
            System.out.println(name + " пробежал " + distanceRun + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distanceRun + " м.");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        if (distanceSwim >= 0 && distanceSwim <= 10) {
            System.out.println(name + " проплыл " + distanceSwim + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distanceSwim + " м.");
        }
    }
}
