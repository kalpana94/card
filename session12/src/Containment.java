// object within another object
class outer{
	void show() {
		System.out.println("This is show of outer");
	}
	//nested class
 class inner {
	 
	 void show() {
			System.out.println("This is show of inner");
		}
	}
	
}
public class Containment {

	public static void main(String[] args) {
		outer oRef = new outer();
		oRef.show();
		
		outer.inner iRef = oRef.new inner();
        iRef.show();
	}

}
