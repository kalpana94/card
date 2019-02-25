package com.auribisis.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.auribisis.model.Student;

public class DBHelper {
     Connection con;
     Statement stmt;
     PreparedStatement pstmt;
	public DBHelper() {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(">>Driver Loaded");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	 
 }
	public void createConnection() {
		try {
			String url ="jdbc:mysql://localhost/database1";
			String user = "root";
			String password ="";
					
		 con = DriverManager.getConnection(url,user,password);
		 System.out.println("$$$Connection created");
		} catch (Exception e) {
			
			e.printStackTrace();	
	}
	
	
	}
	public void insertStudentInDB(Student sRef) {
		try {
			
			String sql = "Insert into student values(null,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,sRef.name);
			pstmt.setString(2,sRef.phone);
			pstmt.setInt(3,sRef.age);
			pstmt.setString(4,sRef.address);
			
			int i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(">>"+sRef.name+" Inserted in table");
			}else {	
				System.out.println(">>"+sRef.name+"  Not Inserted in table");
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
	public void updateStudentInDB(Student sRef) {
		try {
			String sql = "update Student set name= ?,phone= ?,age= ?, address= ?, where roll = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,sRef.name);
			pstmt.setString(2,sRef.phone);
			pstmt.setInt(3,sRef.age);
			pstmt.setInt(4,sRef.roll);	
			pstmt.setString(5,sRef.address);
			
			int i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(">>"+sRef.name+" Updated in table");
			}else {	
				System.out.println(">>"+sRef.name+"  Not Updated in table");
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} 
	
	public void deleteStudentInDB(Student sRef) {
	
		try {
			String sql = "delete from Student  set name= ? where roll = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,sRef.name);
			pstmt.setInt(1,sRef.roll);
			
			
			int i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(">>"+sRef.name+" deleted from table");
				System.out.println(">>"+sRef.roll+" deleted from table");
			
			}else {	
				System.out.println(">>"+sRef.name+" Not deleted from table");
				System.out.println(">>"+sRef.roll+" Not deleted from table");
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} 
	public void fetchStudentInDB(Student sRef) {
		try {
			
			String sql = "Select * from  Student ";
			pstmt = con.prepareStatement(sql);
			ResultSet rs =pstmt.executeQuery();

			while(rs.next()) {
			Student s = new Student();
			s.roll = rs.getInt(1);
			s.name = rs.getString(2);
			s.phone= rs.getString(3);
			s.age  = rs.getInt(4);
			s.address = rs.getString(5);
			
			System.out.println(s);
			System.out.println();
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	public void processBatch() {
			try {
				String sql1 ="update Student set name ='Fionna flynn',phone = '8723567800',age = 20,address= 'Camino Height'";
				String sql2 ="delete from Student where roll = 4";
				con.setAutoCommit(false);
				
				stmt =con.createStatement();
				stmt.addBatch(sql1);
				stmt.addBatch(sql2);
				stmt.executeBatch();
				con.commit();
				
				System.out.println(">> Transaction Done !!");
				
	          } catch (Exception e) {
	        	  e.printStackTrace();
			
	          try{
	        	  con.rollback();
	        	  System.out.println(">> We have roll backed Transaction");
	        	  }catch(SQLException  e1) {
	        		  e1.printStackTrace();
	        	  }
	          }
			
		}
	public void processBatchAsTransaction() {
		try {
			String sql1 ="update Student set name ='Fionna flynn',phone = '8723567800',age = 20,address= 'Camino Height'";
			String sql2 ="delete from Student where roll = 4";
			
			con.setAutoCommit(false);
			stmt =con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.executeBatch();
			con.commit();
			System.out.println(">> Transaction Done !!");
			
		} catch (Exception e) {
      	  e.printStackTrace();
		  
      	try{
      	  con.rollback();
      	  System.out.println(">> We have roll backed Transaction");
      	  }catch(SQLException  e1) {
      		  e1.printStackTrace();
      	  
		} 
		
		}
	}
	public void closeConnection() {
		try {
			con.close();
			System.out.println("Connection Closed");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
	
	

