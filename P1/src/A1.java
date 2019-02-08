// textual representaion of
public class A1 {

		double latitude;
		double longitude;
		String adrsLine ;
		String city;
		int zipCode;
		String label;

	

    void setA1Details(double latitude,double longitude,String adrsLine ,String city,int zipCode,String label) {
	this.latitude = latitude;
	this.longitude = longitude;
	this.adrsLine = adrsLine ;
	this.city = city;
	this.zipCode = zipCode;
	this.label = label;
      }
     void showA1Details() {
		
    
    	System.out.println("^^^^^^^^^^^^^Address^^^^^^^^^^^^^^^^");
		System.out.println("Location: "+latitude+"  : "+longitude);
		System.out.println(" Address Line: "+adrsLine);
		System.out.println("City:"+city+" | "+zipCode);
		System.out.println("Address Type: "+label);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
	
            }
}