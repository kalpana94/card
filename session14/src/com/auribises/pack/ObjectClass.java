package com.auribises.pack;
// textual representation of object 
// object is built in class in java which is parent to all the classes in java

class CA{   // extends object 
	void fun() {
		
	}
	
	// override
	
	public String toString() {
		String str = "Hello !!!!";
		//String str = "hello !!!!"+super.toString();
		return str;
	}
}
public class ObjectClass {

	public static void main(String[] args) {
	
         CA cRef = new CA();
         System.out.println("cRef class is :"+cRef.getClass());
         System.out.println("cRef class is :"+cRef.getClass().getName());
         System.out.println("cRef class is :"+cRef.getClass().getSimpleName());
         
         System.out.println("cRef hashcode is :"+cRef.hashCode());
         System.out.println("cRef toString is :"+cRef.toString());
         
         System.out.println("cRef is :"+cRef);
	}

}
