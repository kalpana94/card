package com.auribesis;

class CA{
	CA(){
		System.out.println(">> CA object constructed");
	}
	CA(int x){
		this();
		System.out.println(">> CA object constructed and x is:"+x);
	}
}
class CB extends CA{
	CB(){
		super(10);
		System.out.println(">> CB object constructed");
	}
}
class CC extends CB{
	CC(){
		System.out.println(">> CC object constructed");
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		CC cRef = new CC();

	}

}
