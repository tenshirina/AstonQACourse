package org.example.lesson_6.Task01;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catCount++;
    }

    public static void showCatCount() {
        System.out.println("Количество кошек: " + catCount);
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

    public void catEat(int needFood, CatBowl bowl) {
        if (bowl.getFoodCountInBowl() - needFood >= 0) {
            bowl.reduceFoodCount(needFood);
            this.satiety = true;
            System.out.println("Кот " + name + " сыт");
        } else {
            System.out.println("Кот " + name + " голоден");
        }
    }
}
