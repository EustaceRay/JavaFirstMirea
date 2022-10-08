package ru.mirea.task3;

public class Head {
    String eyes;
    String nose;
    String ears;
    String hair;
    public Head(String eyes, String nose, String ears, String hair){
        this.eyes = eyes;
        this.nose = nose;
        this.ears = ears;
        this.hair = hair;
    }

    public void head(String eyes, String nose, String ears, String hair){
        System.out.println("Цвет глаз: " + eyes);
        System.out.println("Форма носа: " + nose);
        System.out.println("Уши: " + ears);
        System.out.println("Цвет волос: " + hair);
    }
}
