 class product{
	 // attributes: property of object
	 int pid;
	 String name;
	 String  brandName;
	 int price;
	  product(){
		  System.out.println(">> product object constructed");
		  
	  }
	  void setdataforproduct(int pid,String name,String  brandName,int price){
		  this.pid = pid;
		  this.name = name;
		  this.brandName = brandName;
		  this.price =price ;
		  
	  }
	  void showdataforproduct() {
		  System.out.println("*********Product "+pid+"*******");
		  System.out.println("Name :"+name);
		  System.out.println("BrandName :"+brandName);
		  System.out.println("Price : \u0296"+price);
		  System.out.println("*******************************");
	  }
	  
 }
 // form Is A relation
 // mobile phone is IS A product
 class mobilephone extends product{
	 String os;
	 int ram;
	 int memory;
	  
	 mobilephone(){
		 System.out.println(">> mobilephone object constructed");
	 }
	 // overloading
	 void setdataforproduct(int pid,String name,String  brandName,int price,String os,int ram,int memory){
		  this.pid = pid;
		  this.name = name;
		  this.brandName = brandName;
		  this.price =price ;
		  this. os = os;
		  this.ram = ram;
		  this.memory =memory;
		  
	  }
	 // overriding
	 void showdataforproduct() {
		  System.out.println("*********Product "+pid+"*******");
		  System.out.println("Name :"+name);
		  System.out.println("BrandName :"+brandName);
		  System.out.println("Price : \u0296"+price);
		  System.out.println("Os :"+os);
		  System.out.println("Ram :"+ram);
		  System.out.println("Memory :"+memory);
		  System.out.println("*******************************");
	  }
	 void setdataformobilephone( String os,int ram,int memory) {
		 this.os = os;
		 this.ram = ram;
		 this.memory = memory;
		  }
	 void showdataformobilephone() {
		  System.out.println("*********Mobilephone Details*******");
		  System.out.println("Os :"+os);
		  System.out.println("Ram :"+ram);
		  System.out.println("Memory :"+memory);
		  System.out.println("***********************************");
		   }
 }
public class Inheritance {

	public static void main(String[] args) {
     mobilephone mRef = new mobilephone();
     mRef.setdataforproduct(101,"iPhone","Apple",100000,"IOS",4,128);
     mRef.showdataforproduct();

	}

}
