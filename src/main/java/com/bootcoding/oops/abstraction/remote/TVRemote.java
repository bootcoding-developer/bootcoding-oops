package com.bootcoding.oops.abstraction.remote;

public class TVRemote extends Remote{
    @Override
    public void start() {
        //logic to start TV
    }
    public void stop(){
        System.out.println("Stopped!");
    }
}
