class CA{
	 int a;
	 static int b;
	 
	 void show() {
		 System.out.println("This is show of CA object");
}
	 static void Hello() {
		 System.out.println("This is hello of CA object"); 
		 
	 }

	
}
class CB extends CA{
	
}
public class OopsInhertance {

	public static void main(String[] args) {
	
     CB cRef = new CB();
     cRef.show();
     CB.Hello();
     
     cRef.b = 400;
     cRef.Hello();
     System.out.println("cRef :"+cRef);
	}

}
