package com.samsung;

import com.samsung.models.Cat;
import com.samsung.models.Leopard;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Pushok", 5);
        Cat cat2 = new Cat("Oleg", 10);
        Cat cat3 = new Cat("My cat");
        Cat cat4 = new Cat();
        Leopard leopard = new Leopard();
        leopard.attack();

        System.out.println(cat1.toString());
        System.out.println(cat1);

        cat1.info();
    }
}
