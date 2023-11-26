package ru.mirea.lab3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Mike Smith", "miSmith@gmail.com", 'M');
        Author a2 = new Author("Elena Drozdova", "elDrozdova@gmail.com", 'F');
        Author a3 = new Author("Ivan Popov", "ivPopov@gmail.com", 'M');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}