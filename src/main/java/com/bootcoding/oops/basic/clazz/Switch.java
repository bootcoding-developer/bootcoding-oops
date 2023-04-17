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

    public static void main(String[] args) {
        Switch sw = new Switch();
        sw.color = "White";
        sw.brand = "Anchor";
        sw.buttons = 4;
        sw.price = 175.00;
        sw.powerSocket = false;
        sw.type = "Normal Switch Box";
        sw.material = "Plastic";

        System.out.println("sw.color = " + sw.color);
        System.out.println("sw.brand = " + sw.brand);
        System.out.println("sw.price = " + sw.price);
        System.out.println("sw.buttons = " + sw.buttons);
        System.out.println("sw.powerSocket = " + sw.powerSocket);
        System.out.println("sw.material = " + sw.material);
        System.out.println("sw.type = " + sw.type);
    }
}
