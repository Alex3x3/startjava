package com.startjava.lesson_2_3.person;

public class Person {

    String name = "Иван";
    char sex = 'M';
    double height = 1.86;
    int weight = 80;

    void walk() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void talk() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " изучает Java");
    }
}