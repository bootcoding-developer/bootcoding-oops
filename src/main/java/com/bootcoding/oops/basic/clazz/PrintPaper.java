package com.bootcoding.oops.basic.clazz;

public class PrintPaper {
  String  type;
  int size;
  String  color;
  String  brand;
  double  price;

  public static void main(String[] args) {
    PrintPaper pp  = new PrintPaper();
    pp.type = "A4 Paper";
    pp.color = "Yellow";
    pp.brand = "Aerial Bond";
    pp.price = 15.00;

    System.out.println("pp.type = "+ pp.type);
    System.out.println("pp.brand = "+ pp.brand);
    System.out.println("pp.price = "+ pp.price);
    System.out.println("pp.color = "+ pp.color);
  }
}
