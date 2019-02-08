
public class O1 {
	int orderId;
	String date;
	String time;
    int price;
     
    void setO1Details(int orderId,String date,String time,int price) {
    	this.orderId  = orderId;
    	this.date = date;
    	this.time = time;
    	this.price = price;
    }
   
    void showO1DEtails() {
    	System.out.println("@@@@@@Order: "+orderId+"@@@@@@@@");
    	System.out.println(" DateTime: "+date+" |"+time);
    	System.out.println(" Price: \u20b9"+price);
    	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    
    }

}
