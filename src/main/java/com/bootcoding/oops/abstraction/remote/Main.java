package com.bootcoding.oops.abstraction.remote;

public class Main {
    public static void main(String[] args) {
        ProjectorRemote remote = new ProjectorRemote();
        TVRemote remote1 = new TVRemote();
        m1(remote1);
    }

    private static void m1(Remote remote) {
        remote.start(); //
    }
}
