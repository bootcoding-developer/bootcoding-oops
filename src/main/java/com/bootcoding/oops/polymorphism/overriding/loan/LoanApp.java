package com.bootcoding.oops.polymorphism.overriding.loan;

public class LoanApp {
    public static void main(String[] args) {
        HomeLoan hl = new HomeLoan();
        double hlROI = hl.calculateROI();
        System.out.println("HOME Loan ROI: " + hlROI);

        // Method Overriding Rules
        // Method Name must be same
        // Method parameters must be same
        // Method parameters order must be same
        // But it must in a different class with Inheritance IS-A
  //        Relation
    }
}
