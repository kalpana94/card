package com.auribisis.main;

import com.auribisis.db.DBHelper;
import com.auribisis.model.Student;

public class App {

	public static void main(String[] args) {
		
		Student sRef1 = new Student();
		sRef1 .roll= 0;
		sRef1 .name= "kapil";
		sRef1 .phone= "7235600012";
		sRef1 .age= 30;
		sRef1 .address= "Anand nagar";
		 
		Student sRef2 = new Student(8,"Joe watson", "78234679999",32,"Estern Shoes");
		
	    DBHelper helper = new DBHelper();
         
	   helper.createConnection();
	   helper.processBatchAsTransaction();
	   helper.closeConnection();
	}

}
