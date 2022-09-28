package ru.mirea.task2;

public class Ball {
    String ball;
    String jump;

    public Ball(String Ball, String jump ){
        this.ball = Ball;
        this.jump = jump;
    }
    public static void main(String[] args){
        Ball krug = new Ball("мячь", "прыг-скок");
        System.out.println("объект - " + krug.ball);
        System.out.println(krug.jump);
    }
}
