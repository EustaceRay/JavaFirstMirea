package ru.mirea.task3;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        System.out.print("Введите имя автора: ");
        Scanner AutorName = new Scanner(System.in);
        String AU = AutorName.nextLine();
        Book autors = new Book(AU);

        System.out.print("Введите название книги: ");
        Scanner BookName = new Scanner(System.in);
        String BU = BookName.nextLine();
        Book books = new Book(BU);

        System.out.print("Введите год издания книги: ");
        Scanner BookEar = new Scanner(System.in);
        String EU = BookEar.nextLine();
        Book ears = new Book(EU);

        System.out.println("Информация о книге:");
        autors.BookAutor(AU);
        books.BookName(BU);
        ears.BookEar(EU);
    }
}
