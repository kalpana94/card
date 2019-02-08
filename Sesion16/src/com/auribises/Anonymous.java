package com.auribises;
 
interface  inf1{
	void show(); // public abstract void show();
	void hello();
}
class CA implements inf1{
	public void show() {
		System.out.println("This is show");
	}
	public void hello() {
		System.out.println("This is hello");
	}
}
public class Anonymous {

	public static void main(String[] args) {
	// reference variable of interface is pointing to the object which implements it!!
		/*inf1 iRef = new CA();
		iRef.show();
		iRef.hello();*/
		
		// anonymous class in java
		// object of anonymous class is created automatically and its HashCode is shared in ref var ofinterface
		// they can have only one single object 
		// we cannot have constructors here
		// we can have blocks !!
		inf1 iRef = new inf1() {
			{
			System.out.println("This is block");
		}
     public void show() {
    	 System.out.println("This is show");
     }
     public void hello() {
    	 System.out.println("This is hello");
     }
	};
	iRef.show();
	iRef.hello();

	}
}
