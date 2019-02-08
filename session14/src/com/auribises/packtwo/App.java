package com.auribises.packtwo;
import   com.auribises.packone.one;
// import com.auribises.packtwo; // not accessible outside the package => error

// inheritance across the package
// only public and protected will be inherited, private and default will  not be  inherited 
// protected after inheritance behaves like private
class CA extends one{
	
	void fun()
	{
		//pvtshow();=> error
		//defshow();=> error
		proshow();
	}
}
public class App {

	public static void main(String[] args) {
		//one oRef = new one();		
	    //oRef.pvtshow(); // error
	    //oRef.defshow();
	    //oRef.pubshow();
        //oRef.proshow();
		
		 CA cRef = new CA();
		 //cRef.pvtshow();
		 //cRef.proshow();
		 //cRef.defshow();
		   cRef.pubshow();
		   cRef.fun();
	}

}
 // public is accessible with in package and even outside the package
// public class is the only class which can be imported outside the package
// public class's public methods are accessible outside the package
