
 class Point {
	static int x;
	
	static {
		x = 100;
		System.out.println("This is static block of point ");
	 }
	{
		System.out.println("This is block of point ");
	}
}
  public class Block{
	  static {
		  System.out.println("This is static block of Block ");
	  }
	public static void main(String[] args) {
		System.out.println("Main started");
		Point pRef = new Point();
		System.out.println("pRef:"+pRef);
		// local variables initialization
		int a = 0;
		a = a+10;
		
		System.out.println("Main finished");
		
				
	

	}

}
