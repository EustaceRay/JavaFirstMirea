package ru.mirea.task3;

public class Leg {
    String foot;
    String kness;
    String longs;

    public Leg(String foot, String kness, String longs){
        this.foot = foot;
        this.kness = kness;
        this.longs = longs;
    }

    public void leg(String foot, String kness, String longs){
        System.out.println("Ступни: " + foot);
        System.out.println("Колени: " + kness);
        System.out.println("Длинна ног: " + longs);
    }
}
