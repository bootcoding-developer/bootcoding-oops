package com.bootcoding.oops.basic;

public abstract class Remote {
    public abstract void start();
    public void stop(){
        System.out.println("Closed");
    }
}
