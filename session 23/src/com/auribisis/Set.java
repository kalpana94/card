package com.auribisis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("john");
		list.add("Alice");
		list.add("kia");
		list.add("sia");
		list.add("jennie");
		System.out.println("List is:"+list);
		System.out.println("List size is:"+list.size());
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("john");
		set.add("Alice");
		set.add("kia");
		set.add("sia");
		set.add("jennie");
	    
		System.out.println("Set is:"+set);
		System.out.println("Set size is:"+set.size());
		if(set.contains("Alice")){
			System.out.println("Alice is in the set");
			}
		set.remove("jennie");
		System.out.println("Now set is :"+set);
		
		HashSet<String> names =  new HashSet<String>();
		names.add("Lia");
		names.add("Mia");
		names.add("Mike");
		
		set.addAll(names);
		System.out.println("Set now is:"+set);
		
		System.out.println("@@@@Iterator@@@@@@");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		
		
		
		
		
		
		
	}

}
