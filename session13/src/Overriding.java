
class parent {
	void purchaseBike() {
		System.out.println("let's buy Bajaj pulsar");
	}
	
	static void purchase() {
		System.out.println("let's buy Maruti swift");

	}
	
}
class child extends parent{
	void purchaseBike() {
		System.out.println("let's buy Royal enfiled");
	}
	// hiding
	static void purchaseCar() {
		System.out.println("let's buy Honda city");

	}
}
public class Overriding {
  // overriding
	public static void main(String[] args) {
		
    child ch = new child();
    ch.purchaseBike();
    
    child.purchaseCar();
			

		
		
	}

}
