package com.bootcoding.oops.polymorphism.overriding.loan;

public class HomeLoan extends BaseLoan{

    public double calculateROI(){
        System.out.println("Child method Invoked");
        return 9.5;
    }

    // Child            - Parent
    // SubClass         - SuperClass
    // Derived CLass    - Base Class
}
