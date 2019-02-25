package com.auribesis;
class parent{
	void hello() {
		System.out.println("This is hello in parent");
	}
}
class child extends parent{
	void hello() {
		System.out.println("This is hello in child");
		super.hello();
	}
	}

public class SuperDemoAgain {

	public static void main(String[] args) {
	child c = new child();
	c.hello();

	}

}
