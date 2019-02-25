package com.auribises.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.auribises.modal.Student;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("john");
		s1.setPhone("8727998895");
		s1.setAge(24);
		s1.setAddress("Redwood Shores");
		
		Student s2 = new Student(2,"jennie","9569077564",23,"Country Homes");
		System.out.println("s1 is:"+s1);
		System.out.println("s2 is:"+s2);

		try {
			// 2.load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">>Driver Loaded");
			
			//3. Create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/database1","root","");
			System.out.println("Connection created");
            
			//4. write SQL statement to insert data in database
			String sql = "insert into student values(null,'"+s2.getName()+"','"+s2.getPhone()+"','"+s2.getAge()+"','"+s2.getAddress()+"')";
	
			//5. execute SQL statement 
            Statement  stmt = con.createStatement();
            int i = stmt.executeUpdate(sql);
            
            if(i>0) {
            	System.out.println(">>"+s2.getName()+" Inserted in table");
            }else {
            	System.out.println(">>"+s2.getName()+" not Inserted in table");
            }
           // 6. close the connection
            con.close();
            System.out.println("Connection Closed");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}

}
