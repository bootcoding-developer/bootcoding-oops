package com.bootcoding.oops.abstraction.remote;

public abstract class Remote {
    public abstract void start();
    public void stop(){
        System.out.println("Closed");
    }
}
