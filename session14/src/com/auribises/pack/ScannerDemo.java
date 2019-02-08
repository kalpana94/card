package com.auribises.pack;

import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		//System.out ->output - on console
		// System.in ->input- from console
		// in is a reference variable of inputStream class
     Scanner scanner = new Scanner(System.in);
     System.out.println("what is your name?");
     String  name = scanner.next(); // next line
     System.out.println("Hello,"+name+" !!");
     System.out.println("enter number A:");
     int a = scanner.nextInt();
    
     
     System.out.println("enter number B:");
     int b = scanner.nextInt();
     
     int sum = a+b;
     System.out.println("sum is :"+sum);
     
     scanner.close();
     
     
     
	}

}
