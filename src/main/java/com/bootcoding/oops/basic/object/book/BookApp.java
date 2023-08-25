package com.bootcoding.oops.basic.object.book;

public class BookApp {
    public static void main(String[] args) {
        System.out.println("");
        int a = 10;
        String s = "Test";
        Book b = new Book();
        b.autherName ="Author";
        b.title = "The Java from Bootcoding";
        //b.publisherName = "The Hitavada";
        b.price = 100.00;

        System.out.println(b.title);
        System.out.println(b.autherName);
//        System.out.println(b.publisherName);
        System.out.println(b.price);
    }
}
