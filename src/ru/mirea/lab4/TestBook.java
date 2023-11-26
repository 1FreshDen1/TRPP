package ru.mirea.lab4;

public class TestBook {
    public static void main(String[] args) {
        Book myBook = new Book("Рэй Брэдбери", "451 градус по Фаренгейту", 1953);
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());
    }
}