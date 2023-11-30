package com.example;

import com.example.classes.Cat;
import com.example.classes.Dog;

public class Main {
    public static void main(String[] args) {
        Cat kucing = new Cat("Kitty", "Darat");
        kucing.eat();
        kucing.roam();

        Dog anjing = new Dog();

        anjing.eat(); // anjing sebagai hewan
        anjing.friendly(); // anjing sebagai peliharaan
        anjing.hunt(); // anjing sebagai karnivora
        anjing.play(); // anjing sebagai peliharaan
        anjing.roam(); // anjing sebagai hewan
    }
}