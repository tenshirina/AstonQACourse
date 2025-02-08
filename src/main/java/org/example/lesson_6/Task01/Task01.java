package org.example.lesson_6.Task01;

import java.util.Random;

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
        CatBowl bowl = new CatBowl();
        bowl.fillBowl(50);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Barsik");
        catsArray[1] = new Cat("Pushistik");
        catsArray[2] = new Cat("Sunny");
        catsArray[3] = new Cat("Tosha");
        catsArray[4] = new Cat("Leon");

        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].catEat(random.nextInt(50), bowl);
        }
    }
}
