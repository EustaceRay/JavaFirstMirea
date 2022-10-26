package ru.mirea.task7;

import ru.mirea.task6.MovablePoint;
import ru.mirea.task6.Movable;
import ru.mirea.task6.MovableCircle;

class task7_3 {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public task7_3(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x += xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }
}

class MovableRectangle {
    MovablePoint topLeft;
    MovablePoint topRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint topRight, double xSpeed, double ySpeed) {
        this.topLeft = topLeft;
        this.topRight = topRight;
    }

    String intToString(double value) {
        return String.valueOf(value);
    }
    boolean SpeedTest() {
        return topLeft.xSpeed == topRight.xSpeed && topLeft.ySpeed == topRight.ySpeed;
    }
}