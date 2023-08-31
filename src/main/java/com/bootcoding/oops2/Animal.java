package com.bootcoding.oops2;

public class Animal {

    // Instance Variable
    String name;
    static String type;
    String color;


    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Cat";
        cat.color = "Black";
        // Access - Classname se access kar sakte ho
        Animal.type = "Animal";
        Animal dog = new Animal();
        dog.name = "Dog";
        dog.color = "White";
        System.out.println(cat.type);
        System.out.println(dog.type);
        System.out.println(cat.color);
        System.out.println(dog.color);
        Animal.eat();
        Animal a = new Animal();
        a.run();

        // Static method - Access by Class
        // Non-static method - Access by Object
    }

    public static void eat(){
        System.out.println("I am static method eat()");
    }
    public void run(){
        System.out.println("I am non-static method run()");
    }

    public void drink(){

    }
}
