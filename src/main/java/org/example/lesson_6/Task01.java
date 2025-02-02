package org.example.lesson_6;

import java.util.Random;

class Animal {
    String name;
    static int count = 0;

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

class Cat extends Animal {
    static int catCount = 0;
    static int foodCountInBowl = 0;
    boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catCount++;
    }

    public static void showCatCount() {
        System.out.println("Количество кошек: " + catCount);
    }

    public static void fillBowl(int foodCount) {
        foodCountInBowl = foodCountInBowl + foodCount;
    }

    @Override
    public void run(int distanceRun) {
        if (distanceRun >= 0 && distanceRun <= 200) {
            System.out.println(name + " пробежал " + distanceRun + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distanceRun + " м.");
        }
    }

    @Override
    public void swim(int distanceSwim) {
        System.out.println(name + " не умеет плавать");
    }

    public void catEat(int needFood) {
        if (foodCountInBowl - needFood >= 0) {
            foodCountInBowl = foodCountInBowl - needFood;
            this.satiety = true;
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}

class Dog extends Animal {
    static int dogCount = 0;

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

public class Task01 {
    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(520);
        dogBobik.swim(5);

        catBarsik.run(20);
        catBarsik.swim(0);

        Animal.showCount();
        Dog.showDogCount();
        Cat.showCatCount();

        //Расширение задачи с добавлением возможности котам кушать из миски
        Random random = new Random();
        Cat.fillBowl(50);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Barsik");
        catsArray[1] = new Cat("Pushistik");
        catsArray[2] = new Cat("Sunny");
        catsArray[3] = new Cat("Tosha");
        catsArray[4] = new Cat("Leon");

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].catEat(random.nextInt(50));
        }
    }
}
