package com.auribesis;
 import java.io.IOException;
 
 // user defined unchecked exception
 class MyBankingException extends RuntimeException{
	 MyBankingException(String message){
		 super(message);
	 }
 }
 //user defined checked exception
 class YourBankingException extends Exception{
	 YourBankingException(String message){
		 super(message);
	 }
 }

class Banking{
	int accountBalance= 10000;
	int miniBalance = 2000;
	int attempts = 3;
	
	void withdraw(int amount) throws IOException,YourBankingException  {
		accountBalance = accountBalance - amount;
		if(accountBalance < miniBalance) {
			attempts++;
			accountBalance = accountBalance + amount;
			System.out.println("withdrawl failed. Balance is low \u20b9"+accountBalance);
			
		}else {
			System.out.println("withdrawl Succesful and new Balance is  \u20b9"+accountBalance);
			
		}
		if(attempts == 3) {
			
			//create object of any built in exception and throw it!!
			//ArithmeticException -> IS a child of runtime exception
			
			// we are throwing an unchecked exception
			//Arithmetic exception aRef  = new Arithmetic exception(IIegal attempts);
			// throw aRef; 
			// we can crash program if required
			
			// IOException : IS a child of exception
			//we are throwing an checked exception
			//IOException iRef = new IOException(IIegal attempts);
			//throw iRef; // we get an error here by compiler while throwing a checked exception		
			//As a solution we will use throws keyword in method signature
			
			// we are throwing user defined  unchecked exception
			// MyBankingException mRef = MyBankingException(IIegal attempts);
			//throw mRef;
			
			
			//we are throwing user defined checked exception
			
			 YourBankingException yRef = new YourBankingException("IIegal attempt");
		     throw yRef;
	
		}
	}
}

public class ThrowThrows {

	public static void main(String[] args) {
		System.out.println(">>Banking started");
		Banking bRef = new Banking();
		
     try {
    	  for(int i=1; i<=100;i++){
    	    	 
  			bRef.withdraw(3000);
  		}
	} catch (Exception e) {
	    System.out.println(">> Exception occured");
	}
     System.out.println(">> Banking finished");
		}
      
      
	}


