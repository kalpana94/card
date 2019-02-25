package com.auribises;
class Table{
	void Printable(int num) {
		for(int i = 1; i<=10;i++) {
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
}
class Printer{
	
	// synchronized void printDocument(String  docname,int copies){
	void printDocument(String  docname,int copies) {
		for(int i = 1; i<=copies;i++) {
			System.out.println(">> Printing "+i+" copy of "+docname);
		}
	}
	void fun() {
		System.out.println(">> This is fun");
	}
}

// MyThread IS a relation
class MyThread  extends Thread{
	 Printer pRef;
 MyThread (Printer p){
		 System.out.println("p is :"+p);
		 pRef = p;
		 System.out.println("pRef in MyThread is:"+pRef);
	 }
	public void run() {
		synchronized (pRef) {
		pRef.printDocument("##johnsProfile.pdf",10);
		pRef.fun();
	}
		
	}
	
}
class YourThread  extends Thread{
	 Printer pRef;
	 YourThread (Printer p){
		 System.out.println("p is :"+p);
		 pRef = p;
		 System.out.println("pRef in YourThread is:"+pRef);
	 }
	public void run() {
		synchronized (pRef) {
		pRef.printDocument("##javaEbook.doc",10);
		
	}
		
	}
	
}
public class Synch {

	public static void main(String[] args) {
		Printer pRef = new Printer();
		MyThread mRef = new MyThread(pRef);
		YourThread yRef = new YourThread(pRef);
		mRef.start();
		yRef.start();
	}

}
