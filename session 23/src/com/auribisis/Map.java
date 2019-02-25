package com.auribisis;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(101, "john");
		map.put(102, "jennie");
		map.put(111, "kanika");
		map.put(114, "sheena");
		map.put(345, "monika");
		
		
		map.put(101,"josph");
		map.put(111,"kasis");
		map.put(null,"Harry");
		map.put(234,null);
		map.put(145, "null");
		
		System.out.println("map is:"+map);
		
		String value = map.get(111);
		System.out.println("Value at 111 is:"+value);
		map.remove(114);
		
		System.out.println("Map now is:"+map);
		System.out.println("Map size is:"+map.size());
		
		if(map.containsKey(101)) {
			System.out.println("Yes map contains a key 101");
		}
		if(map.containsValue("john")) {
			System.out.println("Yes map contains a value john");
		}
		Set<Integer> keys = map.keySet();
		System.out.println("keys is:"+keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			String val = map.get(key);
			System.out.println("Key is :"+key+" Value is:"+val);
			
		}
		Hashtable<Integer,String> table = new Hashtable<Integer,String>();
		table.put(111,"kasis");
		table.put(112,"kanika");
		table.put(101,"josph");
		table.put(114,"sheena");
		table.put(145,"null");
		System.out.println("table is:"+table);
		
		
	}

}