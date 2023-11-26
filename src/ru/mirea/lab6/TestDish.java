package ru.mirea.lab6;
public class TestDish {
    public static void main(String[] args) {
        Cup cup = new Cup("Ceramic", 10, "Cup");
        Plate plate = new Plate("Wooden", 20, "Plate");
        cup.getInfo();
        plate.getInfo();
    }
}