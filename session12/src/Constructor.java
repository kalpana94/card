
class point{
	 // attribute -> properties of object
	int x , y;
	
	
	point(){
		x = 5;
		y = 5;
	}
	// non default constructor argument constructor or parameterized constructor
	point(int x , int y){
		this.x = x;
		this.y = y;
	}
	//method property of object
	//1. write data in object
	void setpoint(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	void showpoint() {
		System.out.println("point is :"+x+":"+y);
		
	}
}
public class Constructor {

	public static void main(String[] args) {
	    // object construction statement
		
		point p1 = new point(); // call to default constructor
		point p2 = new point();
		point p3 = new point(112,111);
		 
		p1.setpoint(10 , 20);
		
		p1.showpoint(); // 10 20
		p2.showpoint(); // 0 0

	}

}
