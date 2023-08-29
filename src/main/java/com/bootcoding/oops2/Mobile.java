package com.bootcoding.oops2;

public class Mobile {
    // Properties / Variables

    String model;
    int ram;
    String company;

    public static void main(String[] args) {
        Mobile m = new Mobile();
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
