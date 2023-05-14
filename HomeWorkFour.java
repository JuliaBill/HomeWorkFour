package Homework;

public class HomeWorkFour {

    public static void main(String[] args) {
        canWalk();
        canBuy();
        System.out.println(deviceIsWorking(102, 99));


    }

    static void canWalk() {

        boolean isWeekend = true;
        boolean isRain = false;
        System.out.println(isWeekend ^ isRain);

    }

    static void canBuy() {

        boolean isEdekaOpen = true;
        boolean isReweOpen = true;
        System.out.println("Ich kann einkaufen, es ist " + (isEdekaOpen || isReweOpen));

    }

    static boolean deviceIsWorking(double temperature1, double temperature2) {
        boolean isWorking = temperature1 > 100 && temperature2 < 100;
        return isWorking;


    }

}