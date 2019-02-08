package com.auribesis.Rtp;

class CA{
	 void fun() {
		 System.out.println("This is fun");
	 }
}
interface inf1{
	int x = 10; // public static final int x = 10;
	void show(); // public abstract void show();
	void hello(); // public abstract void hello();
	 
}
interface inf2 {

    int y = 12; // public static final int x = 12;
    void show(); // public abstract void show();
    void hello(); // public abstract void hello();

}

interface inf3 extends inf1 ,inf2{
	
}


class CB extends CA implements inf3{   //inf1,inf2
  
	public void show() {
		System.out.println("This is show");
  }
	public void hello() {
		System.out.println("This is hello");
		
	}
	public void bye() {
		System.out.println("This is bye");
		
	}
}
public class InfoDemo {

	public static void main(String[] args) {
    /*// ref variable of parent objectto object of child
		CA ca = new CB();
		ca.show();
		ca.hello();
		ca.bye();
		ca.fun();
		*/
		//ref variable of parent object interface point to object which implements it
		/*inf1 i1 = new CB();
		i1.show();
		i1.hello();
		//i1.bye();
		//i1.fun();*/

		//ref variable of parent object interface point to object which implements it
				/*inf1 i2 = new CB();
				i2.show();
				i2.hello();
				i2.bye();
				i2.fun();*/
		
		
		// direct object constraction 
		/*CB cb = new CB();
		cb.show();
		cb.hello();
		cb.bye();
		cb.fun();
		 
		 System.out.println("inf1 is :"+inf1);
		 System.out.println("CB.x is :"+CB.x);
		 System.out.println("cb.x is :"+cb.x);
		*/
		inf3 i3 = new CB();
		i3.show();
		i3.hello();
		//i3.bye();
		//i3.fun();
				
		
	}

}
