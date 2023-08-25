package com.bootcoding.oops.basic.object.book;

public class Book{
    // DATA MEMBERS
    public String title;
    public int pages;
    public String autherName;
    private String publisherName;
    double price;

    public void print(){
        publisherName = "Test";
        System.out.println(publisherName);
        display();
    }

    private void display(){
        publisherName = "Test";
        System.out.println(publisherName);
    }
}
