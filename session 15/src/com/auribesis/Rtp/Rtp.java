package com.auribesis.Rtp;


/*class Cab{
	Cab(){
		System.out.println(">>Cab object constructed");
		
	}
	void bookCab(String source,String destination) {
		System.out.println(">> Cab booked from "+source+" to "+destination+"!! Arriving soon");
	}
}*/

// we can not instantiate it i.e we can no create its object!!
// but run time environment will create its object
 /*abstract class Cab{
	Cab(){
		System.out.println(">>Cab object constructed");
		
	}
	// abstract method is a rule | protocol which children must define
	 abstract void bookCab(String source,String destination);
	 
	 // we can have concurrent methods i.e regular methods
	 void fun() {
		 System.out.println("This is fun"); 
	 }
 }*/
 // Interfaces cannot have object at any cost 
 //Neither we nor Rte can create objects
  interface Cab {
		/*Cab(){
			System.out.println(">>Cab object constructed");
			
		}*/
		void bookCab(String source,String destination); // public void abstract
		/*void fun() {
			 System.out.println("This is fun"); 
		 }*/
  }
//mini cab IS-A  cab(Inheritence)
// object of mini cab implements cab
  
class  MiniCab implements Cab{  // extends cab
	
	MiniCab() {
		System.out.println(">>MiniCab object constructed");
		
	}
	 public void bookCab(String source,String destination) {
		System.out.println(">>Mini Cab booked from "+source+" to "+destination+"!! Arriving soon");
	}
}
class LuxaryCab  implements  Cab{

	LuxaryCab() {
		System.out.println(">>luxaryCab object constructed");
		
	}
	 public void bookCab(String source,String destination) {
		System.out.println(">>LuxaryCab booked from "+source+" to "+destination+"!! Arriving soon");
	}
}
class Bike implements   Cab{
	
    Bike() {
		System.out.println(">> Bike object constructed");
		
	}
	public void bookCab(String source,String destination) {
		System.out.println(">>Bike booked from "+source+" to "+destination+"!! Arriving soon");
	}
}
public class Rtp {

	public static void main(String[] args) {
		/*Cab cRef
        cRef = new Cab();
        cRef.bookCab("Auribisis", "Silver Arc");*/
		// use such a statement when we have to execute only 1 single method on object
		// here we have no reference to object
		// new Cab().bookCab("Auribisis", "Silver Arc");
		 /*MiniCab mRef;
		  * mRef = new MiniCab();
		  * mRef.bookCab("Auribisis", "Silver Arc");
		  */
		 Cab cRef;   
		 //Ref var of parent can point to object of child
		 //Ref var of Interface can point to object which implements it
		 cRef = new MiniCab();   // polymorphism statement
		 cRef.bookCab("Auribisis", "Silver Arc");
		  
		 System.out.println();
		 
		 cRef = new LuxaryCab();
		 cRef.bookCab("Auribisis", "Silver Arc");
		  
		 System.out.println();
		 
		 cRef = new Bike();
		 cRef.bookCab("Auribisis", "Silver Arc");
		  
		 
		 System.out.println();
		 // Creating object of cab and executing bookcab of cab object is no sense
		 //cRef = new cab();
		 //cRef.bookCab("Auribisis", "Silver Arc");
		 
		 
		
	}

}
