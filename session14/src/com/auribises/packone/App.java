package com.auribises.packone;

public class App {

	public static void main(String[] args) {
		one oRef = new one();
		two tRef = new two();
		
		//oRef.pvtshow(); // error
		oRef.defshow();
		oRef.pubshow();
		oRef.proshow();
		
		System.out.println();
		
	    // tRef.pvtshow(); -> error
		tRef.defshow();
		tRef.pubshow();
		tRef.proshow();
		
	}

}
 // within the same package everyone is accessible accept the private
// private is accessible only with in package/object
// if u wish to access private access it indirectly 