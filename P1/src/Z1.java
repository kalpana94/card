
public class Z1 {

	public static void main(String[] args) {
		A1[] arr = new A1[3];
		for(int i= 0; i<arr.length;i++) {
			arr[i]= new A1();
			}
		
		
		O1[] orr = new O1[5];
		for(int i= 0; i<orr.length;i++) {
			orr[i] = new O1();
		}
		
		
		arr[0].setA1Details(34.055,74.304,"redwood shores","ludhiana",141001,"home");
		
		arr[1].setA1Details(35.055,72.304,"country homes","ludhiana",141003,"work");
		
		arr[2].setA1Details(36.055,71.304,"pristine homes","ludhiana",141002,"uncle");
		
		
		
		orr[0].setO1Details(101,"30-01-2019","10:00",200);
		orr[1].setO1Details(102,"30-01-2019","10:20",300);
		orr[2].setO1Details(103,"30-01-2019","10:40",400);
		orr[3].setO1Details(104,"30-01-2019","11:00",500);
		orr[4].setO1Details(105,"30-01-2019","11:30",600);
		  
		C1 c = new C1();
		
		// 1 to many
		c.setDetailsForC1("kapil","8727998895",arr, orr);
		
		
		c.showDetailsForC1();
       
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(c.name+" spent \u20b9"+c.kitnekharachDiye());
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}


	}


