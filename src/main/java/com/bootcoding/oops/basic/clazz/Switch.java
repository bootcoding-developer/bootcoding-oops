package com.bootcoding.oops.basic.clazz;

import com.sun.source.tree.SwitchTree;

public class Switch {
    String color;
    String material;
    String brand;
    int buttons;
    int size;
    double price;
    boolean powerSocket;
    String type;

    public Switch(String color, String brand, double price, String type)
            throws Exception{
        System.out.println("Parametrized Constructor invoked!");
        this.color = color;
            //connection create
            this.type = type; // error
            this.price = price;
            this.brand = brand;


    }

    // Default Constructor
    public Switch(){
        System.out.println("Default constructor of Switch invoked!");
    }

    public void start(){
        System.out.println("Switch is ON");
    }
    public void checkStatus(){
        System.out.println("Switch is OFF");
        Watch w = new Watch();
        w.isWorking();
    }
    public void stop(){
        System.out.println("Switch is OFF");
    }

    public static void main(String[] args) {
        try {
            Switch sw = new Switch("White", "Anchor", 222.22, "16 Amper");

            System.out.println("sw.color = " + sw.color);
            System.out.println("sw.brand = " + sw.brand);
            System.out.println("sw.price = " + sw.price);
            System.out.println("sw.buttons = " + sw.buttons);
            System.out.println("sw.powerSocket = " + sw.powerSocket);
            System.out.println("sw.material = " + sw.material);
            System.out.println("sw.type = " + sw.type);

//        sw.color = "White";
//        sw.brand = "Anchor";
//        sw.buttons = 4;
//        sw.price = 175.00;
//        sw.powerSocket = false;
//        sw.type = "Normal Switch Box";
//        sw.material = "Plastic";
            sw.stop();
            sw.checkStatus();
            sw.start();
        }catch (Exception ex){

        }
    }
}
