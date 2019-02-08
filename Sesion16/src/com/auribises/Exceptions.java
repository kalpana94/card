package com.auribises;

public class Exceptions {

	public static void main(String[] args) {
	
		final boolean debug = false;
		System.out.println(">> Main started ");
		 int a = 10,b=0, c= 0;
		 int arr[] = {10,20,30,40,50};
		 // whenever we detect a crash program stop working
		 // Application stop working
		 //Abnormal termination of program/process -> bad for OS!! 
		 //can be changed to normal with try and catch
		 try {
			 c = a/b;
			 System.out.println("arr[30] is "+arr[30]);
		 } /*catch(ArithmeticException eRef){
			 System.out.println(">> Some exceptions: "+eRef);
		 }catch(ArrayIndexOutOfBoundsException eRef) {
			 //System.out.println(">>Some exceptions: "+eRef);
			 System.out.println(">>Some exceptions");
		 }*/
		 catch(Exception eRef) {
			 if(debug) {
				 // for developers,for debugging
				 eRef.printStackTrace();
			 }else {
				 // for customers
				 System.out.println(">>Some exceptions: "+eRef);
				 
			 }
		  }finally {
			 
			  System.out.println("This is important");
		  }
		 System.out.println("c is: "+c);
				 
		 System.out.println(">> Main finished "); 
				 
				 
			 }
					 
		 

	}


