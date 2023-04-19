package com.bootcoding.oops.basic.clazz;

public class PrintPaper {
  // Data Member
  String  type;
  int size;
  String  color;
  String  brand;
  double  price;

  // behaviour
  // Member Methods
  public void tearPaper(){
    System.out.println("I have tore paper into "  + " pieces");
  }

  public void tearPaper(int pages){
    System.out.println("I have tore paper into "  + " pieces");
  }

  public void tearPaper(double pages){
    System.out.println("I have tore paper into "  + " pieces");
  }


  public void throwPaper(){
    System.out.println("Paper fekla ka.... Arrr!");
    Switch sw = new Switch();
  }

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
    pp.tearPaper(4.5);
    pp.throwPaper();
  }
}
