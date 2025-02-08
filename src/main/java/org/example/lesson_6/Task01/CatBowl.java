package org.example.lesson_6.Task01;

public class CatBowl {
    private int foodCountInBowl;

    public CatBowl() {
        this.foodCountInBowl = 0;
    }

    public int getFoodCountInBowl() {
        return foodCountInBowl;
    }

    public void fillBowl(int foodCount) {
        foodCountInBowl = foodCountInBowl + foodCount;
    }

    public void reduceFoodCount(int eatenFood) {
        foodCountInBowl = foodCountInBowl - eatenFood;
    }
}
