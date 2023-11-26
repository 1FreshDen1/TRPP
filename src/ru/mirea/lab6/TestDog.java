package ru.mirea.lab6;
public class TestDog {
    public static void main(String[] args) {
        Breed b1 = new Breed("Alabay");
        Breed b2 = new Breed("Chihuahua");
        Breed b3 = new Breed("Poodle");
        b1.infoDog();
        b2.infoDog();
        b3.infoDog();
    }
}