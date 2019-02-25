package com.auribises.modal;
/*
 SQL:
 create table Student(
roll int primary key auto_increment,
name varchar(256),
phone varchar(20),
age int,
address varchar(512)
)
Insert into student values(null,'Fionna','889522347',22,'Eastern Shores')";
*/
public class Student {
	int roll;
	String name;
	String phone;
	int age;
	String address;
	
	public Student() {

}


	public Student(int roll, String name, String phone, int age, String address) {
	
		this.roll = roll;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.address = address;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", phone=" + phone + ", age=" + age + ", address=" + address
				+ "]";
	}


	
}
