package com.auribesis;

public class LocalClasses {

	void fun1(){
		
		class A{
			void show() {
				System.out.println("This is show from fun1");
			}
		}
		 A aRef=new A();
		 aRef.show();
	}
	static void fun2() {
		class A{
			void show() {
				System.out.println("This is show from fun2");
			}
		}
		A aRef=new A();
		 aRef.show();
	}
	public static void main(String[] args) {
		LocalClasses iRef = new LocalClasses();
		iRef.fun1();
		LocalClasses.fun2();
	}

}
