package ru.mirea.task3;

public class Hand {
    String hand;
    String upper_arm;
    String shoulder;

    public Hand(String hand, String upper_arm, String shoulder){
        this.hand = hand;
        this.upper_arm = upper_arm;
        this.shoulder = shoulder;
    }

    public void ruka(String hand, String upper_arm, String shoulder){
        System.out.println("Кисть: " + hand);
        System.out.println("Предплечье: " + upper_arm);
        System.out.println("Плечо: " + shoulder);
    }
}
