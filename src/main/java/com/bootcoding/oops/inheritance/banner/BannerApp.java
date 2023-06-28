package com.bootcoding.oops.inheritance.banner;

public class BannerApp {
    public static void main(String[] args) {
        FlexBanner fb = new FlexBanner();
        fb.matter = "New Java batches are going to start!";
        fb.type = "Flex Banner";
        fb.create();
        fb.price = 100;
        fb.print2();
        // Constructor Chaining
        // Can you inherit Constructor - No
        //
    }
}
