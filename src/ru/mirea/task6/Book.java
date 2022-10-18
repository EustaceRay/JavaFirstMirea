package ru.mirea.task6;


public class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Book printed!");
    }
}