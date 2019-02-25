package com.auribises;


class myTask extends Thread{
	public	void run() {
		for(int i=1;i<=10;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("@@MY task:"+i);
		}
		
	}
		
	}
class CA{
	
}

class yourTask extends CA implements Runnable{
	public	void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("@@Your task:"+i);
		
		}
	}
}

public class App1 {

	public static void main(String[] args) {
		
		// job1
		
				System.out.println(">>APP started");
				
				// job 1.5 // we are considering this job as blocking blocking job
				// jobs below 1.5 will be blocked
				
				myTask mRef = new myTask(); // thread
				//mRef.runTask(); // error
				mRef.setDaemon(true);
				
				Thread yRef =new Thread(new yourTask());
				Thread.currentThread().setName("komal");
				mRef.setName("kasis");
				yRef.setName("sheena");
				
				Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
				mRef.setPriority(Thread.NORM_PRIORITY);
				yRef.setPriority(Thread.MIN_PRIORITY);
				
				yRef.start();
				
				try {
					yRef.join(); // immediately after start
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				// job 2
				for(int i=1;i<=10;i++) {
					 try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					System.out.println(">>main Thread:"+i);
					
				}
				System.out.println("Main Thread Name:"+Thread.currentThread().getName());
				System.out.println("MyTask Name:"+mRef.getName());
				System.out.println("YourTask Name:"+yRef.getName());
				
				System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
				System.out.println("MyTask Priority :"+mRef.getPriority());
				System.out.println("YourTask  Priority :"+yRef.getPriority());
				
				// job3
				System.out.println(">>App finished");
				
			}
		
	}


