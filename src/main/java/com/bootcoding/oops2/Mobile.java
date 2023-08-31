package com.bootcoding.oops2;

public class Mobile {
    // Properties / Variables

    String model;
    int ram;
    String company;

    public static void main(String[] args) {
        Mobile m = new Mobile();
        // Mobile() - Instruct to create a object of a Class
        // Handover - new - keep it in Heap Memory
        //
        // Heap, Stack and Permgen/MetaSpace (java 8)
        // Stack - Local Variables, Method Parameters
        // Permgen/Metaspace - all static variables, classes, method blocks
        // SCP - String Constant Pool - part of Heap Memory
        m.print();
        m.model = "Iphone 14";
        m.company = "Apple";
        m.ram = 8;
        m.print();
        m.turnOn();
        m.playGames();
        m.calling();
        m.search();
    }

    // Why Constructor is called Constructor?

    void print(){
        System.out.println("MODEL: "+model);
        System.out.println("RAM: "+ ram);
        System.out.println("COMPANY: "+company);
    }

    // Behaviours / Methods
    void turnOn(){
        System.out.println("Phone is switched ON!");
    }
    void calling(){
        System.out.println("Calling others!");
    }
    void playGames(){
        System.out.println("Playing Games!");
    }
    void search(){
        System.out.println("Searching for...");
    }
}
