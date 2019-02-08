
public class Constructors {
	Constructors(){
		System.out.println(">> blocks object constructed");
	}
 // property of object
// initialization block
	{
		System.out.println("This is block1");
	}
	{
		System.out.println("This is block2");
	}
	// property of class
	static {
		System.out.println("This is static block");
	}
	public static void main(String[] args) {
		System.out.println(">> Main started");
		Constructors cRef1 = new Constructors();
		Constructors cRef2 = new Constructors();
		System.out.println("cRef1: "+cRef1);
		System.out.println("cRef2: "+cRef2);
		System.out.println(">> Main finished");
	}

}
