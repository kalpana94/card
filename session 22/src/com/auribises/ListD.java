package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String name;
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	
}

public class ListD {

	public static void main(String[] args) {
		int [] arr = new int[10];
		Integer [] iArr = new Integer[10];
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "deepika";
		 
		Employee e2 = new Employee();
		e2.eid = 102;
		e2.name = "disha";
		
		
		ArrayList list1 = new ArrayList();
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		
		list1.add(10);
		list1.add(2.2);
		list1.add("kapil");
		list1.add("e1");
		list1.add("john");
		list1.add("jeenie");
		
		
		
		list2.add("john");
		list2.add("jack");
		list2.add("jassi");
		list2.add("jim");
		list2.add("toni");
		
		list3.add(e1);
		list3.add(e2);
		
		
		System.out.println(">>>list1<<<");
		System.out.println(list1);
		
		System.out.println();
		
		System.out.println("@@@@list2@@@@");
		System.out.println(list2);
	  
		System.out.println();
		
		System.out.println("$$$$list3$$$$");
		System.out.println(list3);
		
		
		Object o = list1.get(2);
		String str = list2.get(1);
	    Employee e = list3.get(0);
	    
	    System.out.println("o is :"+o);
	    System.out.println("str is :"+str);
	    System.out.println("e is :"+e);
	    
	    
	    System.out.println("size of list1 is :"+list1.size());
	    System.out.println("size of list2 is :"+list2.size());
	    System.out.println("size of list3 is :"+list3.size());
	    
	    
	    System.out.println("*******for*******");
	    for(int i =0;i<list1.size();i++) {
	    	Object o1 = list1.get(i);
	    	System.out.println(o1);
	    }
	     
	    System.out.println();
	     
	    for(int i =0;i<list2.size();i++) {
	    	String s1 = list2.get(i);
	    	System.out.println(s1);
	    }
	   
	     System.out.println();
	     
	     for(int i =0;i<list3.size();i++) {
		    Employee eRef = list3.get(i);
		    	System.out.println(eRef);
		    }
	     
	     System.out.println();
	     
	     
	     System.out.println("*****Iterator*******");
	     Iterator itr1= list1.iterator();	
	     
	     while(itr1.hasNext()) {
	    	 Object o1 = itr1.next();
	    	 System.out.println(o1);
	    	 
	     }
	     
	     System.out.println();	    	 
	     
	     Iterator<String> itr2 = list2.iterator();	     
	   
	     while(itr2.hasNext()) {
	    	 String s1 = itr2.next();
	    	 System.out.println(s1);
	    	 
	    	 
	    	 if (s1.equals("john")) {
	    		 itr2.remove();
	    		 
	    	 }
	    }
	    
	     System.out.println(list2);	    
	     
	     System.out.println("******ListIterator*******");
	     
	     ListIterator listitr = list1. listIterator();
	     while(listitr.hasNext()) {
	    	 Object o1 = listitr.next();
	    	 System.out.println(o1);
	     }
	    System.out.println("-------");
	    while(listitr.hasPrevious()) {
	    	 Object o1 = listitr.previous();
	    	 System.out.println(o1);
	     }
		

	     System.out.println("******Enumeration*******");
	     Enumeration enm = Collections.enumeration(list1);
	     while(enm.hasMoreElements()) {
	    	 Object o1 =enm.nextElement();
	    	 System.out.println(o1);
	     }
		
	     System.out.println("List1 before:"+list1+"| "+list1.size());
	     list1.remove(2);
	     

	     System.out.println("List1 after:"+list1+"| "+list1.size());
	     list1.remove(3);
	     System.out.println("List1 after:"+list1+"| "+list1.size());
	     list1.clear();
	     System.out.println("List1 after:"+list1+"| "+list1.size());
		
		System.out.println(">>>>>>>><<<<<<<<<");
		
		System.out.println("List2");
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Harry");
		list4.add("kim");
		list4.add("sia");
		list4.add("kasis");
		System.out.println("list4");
		
		list2.addAll(list4);
		
		System.out.println("---------");
		System.out.println(list2);
		System.out.println(list4);
		
		int idx = list2.indexOf("jim");
		System.out.println("idx is:"+idx);
		int idx1 = list2.lastIndexOf("jim");
		System.out.println("idx is:"+idx);
		
		if(list2.contains("jack")) {
			System.out.println(" jack is in the list");
		}
		Vector<String> vector = new Vector<String>();
		vector.add("Harry");
		vector.add("kim");
		vector.add("sia");
		vector.add("jia");
		
		
		System.out.println("vector is:"+vector);
		System.out.println("vector 0  is:"+vector.get(0));
		
	}

}
