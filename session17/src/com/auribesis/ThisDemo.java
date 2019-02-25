package com.auribesis;
class Point{
	int x;
	int y;
	Point(){
		x = 1;
		y = 1;
		}
		Point(int x , int y){
			//this.x represents object's x and x represent constructor's of x
			//this is a reference variable which point to current object
			this.x = x;
			this.y = y;
			System.out.println("this is:"+this);
		}
		void showPoint() {
			System.out.println("Point is: "+x+" : "+y);
		}
}

public class ThisDemo {

	public static void main(String[] args) {
		Point pRef1 = new Point();
		Point pRef2 = new Point(10,20);
		Point pRef3 = new Point(12,23);

		
		System.out.println("pRef1 is :"+pRef2);
		System.out.println("pRef2 is :"+pRef3);
		
		pRef1.showPoint();
		pRef2.showPoint();
		pRef3.showPoint();
		
	}

}
