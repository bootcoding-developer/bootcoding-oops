package com.bootcoding.oops.basic.object.book;

public class SmartBook {

    String brand;
    String color;
    double price;
    public void print(){
        System.out.println("Color:"+ color);
        System.out.println("Brand:"+ brand);
        System.out.println("Price:"+ price);
    }
    public SmartBook(){

    }
    public SmartBook(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public static void main(String[] args) {

        for(int i = 0; i < 500; i++){
            System.out.println(i +1);
            createRemote("White", 95.00);
        }

        for(int i = 0; i < 250; i++){
            System.out.println(i +1);
            createRemote("Black", 125.00);
        }

        for(int i = 0; i < 250; i++){
            System.out.println(i +1);
            createRemote("Blue", 115.00);
        }
    }

    private static void createRemote(String color, double price) {
        SmartBook r = new SmartBook();
        r.color = color;
        r.price = price;
        r.brand = "Samsung";
        r.print();
    }
}
