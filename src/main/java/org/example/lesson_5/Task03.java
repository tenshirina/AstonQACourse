package org.example.lesson_5;

class Park {
    String name;

    public Park(String name){
        this.name = name;
    }

    public class AttractionInfo {
        private String name;
        private String workTime;
        private int price;

        public AttractionInfo(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }
        public void showInfo() {
            System.out.println("Название: " + name + ", Время работы: " + workTime + ", Стоимость: " + price);
        }
    }
}

public class Task03 {
    public static void main (String[] args) {
        Park park = new Park("Центральный парк");
        Park.AttractionInfo attraction01 = park.new AttractionInfo("Колесо обозрения", "10:00 - 19:00", 300);
        Park.AttractionInfo attraction02 = park.new AttractionInfo("Американские горки", "12:00-20:00", 650);
    }
}
