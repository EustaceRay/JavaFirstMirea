package ru.mirea.task3;

public class Book {
    String autor;
    String name;
    int ear;

    public Book(String autor){
        this.autor = autor;
        this.name = name;
        this.ear = ear;
    }

    public void BookAutor(String autor) {
        System.out.println("Автор: " + autor);
    }
    public void BookName(String name) {
        System.out.println("Название: " + name);
    }
    public void BookEar(String ear) {
        System.out.print("Год написания: " + ear);
    }
}
