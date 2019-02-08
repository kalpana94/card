package com.auribises;
// single method interface : functional interface -> having single method
interface Shape{
	void draw();
}
public class LambdaExpression {

	public static void main(String[] args) {
		
 /*Shape sRef = new Shape() {
	public void draw() {
		System.out.println(">> Drawing a shape");
		
	}
};
sRef.draw();*/

// lambda expression is just another syntax to write functional interfaces 
Shape sRef = ()->{
	System.out.println(">> Drawing a shape");
};
sRef.draw();
	}

}
