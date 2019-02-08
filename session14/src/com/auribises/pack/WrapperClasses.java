package com.auribises.pack;

public class WrapperClasses {

	public static void main(String[] args) {
     // primitive type
      int x = 10;
      
      // convert primitive type to reference type
      // I can represent int as integer
     Integer xRef = new Integer(x);   // boxing
     
     // xRef is a reference variable pointing to a object of integer
     //Integer is a built in class in java -> wrapper class
     
     float f = 2.3f;
     Float fRef = new Float(f);   // boxing
    
     char ch = 'A';
     Character cRef = new  Character(ch); // boxing
      
     // extracting primitive type to reference types
      int   i = xRef.intValue();   // UNBOXING
      float g = fRef.floatValue();  // UNBOXING
      char  c = cRef.charValue();   //UNBOXING
      
      
      int a = 10;
      Integer aRef = a;    //auto UNBOXING | translate to integer->Integer xRef = new Integer(x);
      
      int b = aRef;         //auto UNBOXING | translate to int b =aRef.intValue();
      
     
     System.out.println("i is :"+i);
     System.out.println("g is :"+g);
     System.out.println("c is :"+c);
     System.out.println("a is :"+a);
     System.out.println("g is :"+g);
     System.out.println("b is :"+b);
     
	}

}
