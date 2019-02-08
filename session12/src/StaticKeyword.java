class counter{
	// non static attribute property of object 
	int count;
	
	//static attribute property of object 
	static int scount;
	
	// non static method property of object
	// we can access  property of class in property of object
	counter(){
		count = 1;
		scount = 1;
	}
	    // non static method property of object
		// we can access  property of class in property of object
	void incrementcount() {
		count++;
		scount++;
	}
	       // non static method property of object
			// we can access  property of class in property of object
	void showcount() {
		System.out.println("count is:"+count+" and scount is :"+scount);
		//System.out.println("scount is :"+scount);
	}
	// static method property of class
	// we cannot access property of object in property of class

	static void show() {
		System.out.println("scount is :"+scount);
	}
}
public class StaticKeyword {

	public static void main(String[] args) {
		counter c1 = new counter();
		counter c2 = new counter();
		counter c3 = c1;
		c1.incrementcount(); // 2 2
		c2.incrementcount(); //2 3
		c3.incrementcount(); // 3 4
		 
		c1.incrementcount(); // 4 5
		c2.incrementcount(); // 3 6
		c2.incrementcount(); // 4 7
		c2.incrementcount(); //5 8
		
		counter c4 = new counter();
		counter.scount = 222;
		
		c1.showcount();
		c2.showcount();
		c3.showcount();
		c4.showcount();
		 
		counter.show();
		
	}

}
