package com.auribises;

class message{
	String msg;

 message() {
	
   msg = ">>no message available";
	}
 void writemessage() {
	 msg = "Be exceptional!!";
	 System.out.println("Message written");
 }
void readmessage() {
	System.out.println("Message is:"+msg);
}
}
class readerThread extends Thread{
	message mRef;
	readerThread(message m){
		mRef = m;
		
	}
	public void run() {
		synchronized(mRef) {
			try {
				mRef.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			mRef.readmessage();
		}
	}
}
class writerThread extends Thread{
	message mRef;
	writerThread(message m){
		mRef = m;
		
	}
	public void run() {
		synchronized(mRef) {
			mRef.writemessage();
			mRef.notifyAll();
			
			
}
}
}

public class WtnDemo {

	public static void main(String[] args) {
		message mRef = new message();
		readerThread rt1= new readerThread(mRef);
		readerThread rt2= new readerThread(mRef);
		writerThread wt= new writerThread(mRef);
		
		rt1.start();
		rt2.start();
		wt.start();
		
		
		System.out.println("RT1:"+rt1.getState());
		System.out.println("RT2:"+rt2.getState());
		System.out.println("Wt:"+wt.getState());
		

	}

}
