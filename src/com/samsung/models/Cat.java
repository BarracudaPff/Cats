package com.samsung.models;

public class Cat {
    public String name = "";
    private int age;

    public Cat(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public Cat(String newName) {
        name = newName;
        age = 0;
    }

    public Cat() {
        name = "no name";
        age = 0;
    }

    public void talk(String message) {
        System.out.println(message);
    }

    public void talk() {
        talk("MEOW");
    }

    public void info() {
        System.out.println(name + " : " + age);
    }

    public void happyBD() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
