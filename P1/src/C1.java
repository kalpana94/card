
public class C1 {
	String name;
	String phone;
	A1[] addresses; // 1 to many
	// order is a reference variable which points to adress object
	O1[] orders;  // 1 to many
	
	//method 1 :write data in object
	void setDetailsForC1(String name, String phone,A1[] addresses,O1[] orders) {
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.orders =orders;
        }
	
	
     void showDetailsForC1() {
    	 System.out.println("******customer  "+name+"********");
    	 System.out.println("phone "+phone);
    	 
    	 System.out.println("##########Addresss#############");
    	 for(A1 aRef : addresses) {
    		 aRef.showA1Details();
    	 }
    	 System.out.println("################################");
    	  
    	 System.out.println("$$$$$$$$$$$$Orders$$$$$$$$$$$$$$$");
    	 for(O1 oRef : orders) {
    		 oRef.showO1DEtails();
    	 }
    	 
    	 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
     //method : customer object
     //computation | business method
  int kitnekharachDiye() {
	int total= 0;
    for(O1 oRef : orders ) {
    	 total = total + oRef.price;
    }
	
    return total;
}
}
