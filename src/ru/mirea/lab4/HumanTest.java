package ru.mirea.lab4;
public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Шатен", "Зеленые");
        Leg leftLeg = new Leg(80); // Предположим, что длина ноги 80 см
        Leg rightLeg = new Leg(80); // Предположим, что длина ноги 80 см
        Hand leftHand = new Hand(5); // Предположим, что 5 пальцев на руке
        Hand rightHand = new Hand(5); // Предположим, что 5 пальцев на руке
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        person.getInfo();
    }
}
