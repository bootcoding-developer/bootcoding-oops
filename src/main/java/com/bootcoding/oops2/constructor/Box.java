package com.bootcoding.oops2.constructor;

public class Box {

    // Properties, Instance Variables or Data Members
    int length;
    int breadth;
    int height;

    public Box(){
        System.out.println("Default Constructor");
        print();
    }

    public Box(int l){
        System.out.println("I am 1 Argument Constructor");
        length = l;
        print();
    }

    public Box(int l, int b){
        System.out.println("I am 2 Argument Constructor");
        length = l;
        breadth = b;
        print();
    }

    public Box(int l, int b, int h){
        System.out.println("I am 3 argument Constructor");
        length = l;
        breadth = b;
        height = h;
        print();
    }
    public void print(){
        System.out.println(length);
        System.out.println(breadth);
        System.out.println(height);
    }

    public static void main(String[] args) {
        Box b = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(5, 6);
        Box b4 = new Box(5,6,7);
    }
}
