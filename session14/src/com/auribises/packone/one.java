package com.auribises.packone;
// public class
//rule of naming : source file name should be the name of the class which is public
public class one {
      
	private void pvtshow() {
		System.out.println("This is private show of one");
	}

	void defshow() {
		System.out.println("This is default show of one");
	}
	
    public void pubshow() {
    	System.out.println("This is public show of one");
    }
    protected void proshow() {
		  System.out.println("This is protected show of one");
	  }
    }
   // default class
	class two {
		private void pvtshow() {
			System.out.println("This is private show of two");
		}
		
		void defshow() {
			System.out.println("This is default show of two");
		}
	  public void pubshow() {
			System.out.println("This is public show of two");
		}
	  protected void proshow() {
		  System.out.println("This is protected show of two");
	  }
	}
	 
/*public	class three {
		
	} */


/*private class four{
	
}*/
	/*protected class five{
		
	}*/
	// we can create public and default classes
	// we cannot create private and protected classes