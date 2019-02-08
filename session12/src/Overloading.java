 class math{
	  void addNumber(int num1 , int num2) {
		  int num3 = num1 + num2;
		  System.out.println("sum1 is:"+num3);
	  }
	  void addNumber(int num1 , double num2) {
		  double num3 = num1 + num2;
		  System.out.println("sum1 is:"+num3);
     }
	  
	  void addNumber(double num1 , double num2) {
		  double num3 = num1 + num2;
		  System.out.println("sum1 is:"+num3);
     }
	  //overloading
	  
	  void addNumber(int num1 , int num2, int num3) {
		  int num4 = num1 + num2 + num3;
		  System.out.println("sum1 is:"+num4);
     }
	  
	  void addNumber(double num1 , double num2,  double num3) {
		  double num4 = num1 + num2 + num3;
		  System.out.println("sum1 is:"+num4);
     }
	  void addNumber(int... arr) {
		  int sum = 0;
		  for(int elm : arr) {
			  sum = sum + elm;
		  }
		  System.out.println("sum is:"+sum);
	  }
 }
	  
public class Overloading {

	public static void main(String[] args) {
		
		math mRef = new math();
		mRef.addNumber(10,20);
		mRef.addNumber(10,20,30);
		mRef.addNumber(10.3,20.4,30.09);
		mRef.addNumber(10,20.05);
		mRef.addNumber(10.58,20);
		
		int[] a1 = {10,20,30,40,50};
		System.out.println("a1 is:"+a1);
		mRef.addNumber(a1);
		mRef.addNumber(10,20,30,40,50,60);
		
	}

}
