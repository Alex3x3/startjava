package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('M');
        wolf.setName("Аккела");
        wolf.setWeight(43);
        wolf.setAge(7);
        wolf.setColor("серый");

        System.out.println("Пол волка: " + wolf.getSex() + 
                "\nКличка волка: " + wolf.getName() +
                "\nВес волка: " + wolf.getWeight() + " кг" + 
                "\nВозраст волка: " + wolf.getAge() + " лет" +
                "\nЦвет волка: " + wolf.getColor());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.hawl();
        wolf.hunt();
    }
}