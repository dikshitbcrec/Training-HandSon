package com.springcore3_day16;
/*
public class PrintableFactory {

public static Printable getPrintable(){

  //return new B();

     return new A();//return any one instance, either A or B

}

}
*/

public class PrintableFactory {

//non-static factory method

public Printable getPrintable(){

  return new A();//return any one instance, either A or B

}

}
