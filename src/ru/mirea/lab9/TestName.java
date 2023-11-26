package ru.mirea.lab9;
public class TestName {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth");
        Car car = new Car("Audi");
        Animal animal = new Animal("Capybara");
        System.out.println("This planet name: " + planet.getName());
        System.out.println("This car brand: " + car.getName());
        System.out.println("This animal is: " + animal.getName());
    }
}