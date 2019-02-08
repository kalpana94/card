package com.auribises;
//final class  cannot be inherited
final class A{
	// final method cannot be override
final	void show() {
		
	}
}
class B{ //extends A
	/*void show() {
     }*/
}
public class FinalDemo {

	public static void main(String[] args) {
	 int a = 10;
	 a = 200; // update operation allowed
	
	 //behaves like constant. x is immutable
	 // final variable
	 final int x = 10;
	 //x = 200; // update operation not allowed
	
	 final int y; // blank final variable
	 y = 100;

	 System.out.println("a is :"+a);
	 System.out.println("x is :"+x);
	 System.out.println("y is :"+y);
	}

}
