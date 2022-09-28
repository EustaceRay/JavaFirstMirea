package ru.mirea.task2;

public class Book {
    String book;
    int year;

    public Book(String book, int year){
        this.book = book;
        this.year = year;
    }
    public static void main(String[] args){
        Book kniga = new Book("Отцы и дети", 1862);
        System.out.println("Название - " + kniga.book);
        System.out.println("Год публикации - " + kniga.year);
    }
}
