package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String args[]) {
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(12, "Chatnya");
		hmap.put(2,"Rakul");
		hmap.put(5,"Arjit");
		hmap.put(55,"Tchikishishma");
		
		// Display contents of hashmap
		
		Set set = hmap.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		String var = hmap.get(2);
		System.out.println("Value at index 2 is "+var);
		
		hmap.remove(2);
		
		System.out.println("Map after removal");
		Set set2 = hmap.entrySet();
		Iterator it2 = set2.iterator();
		while(it2.hasNext()) {
			Map.Entry entry = (Map.Entry) it2.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		// Iterate on HashMap
		
		System.out.println("Using For Loop :");
		for(Map.Entry entry : hmap.entrySet()) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
		System.out.println("Size of hashmap is " + hmap.size());
		
		hmap.clear();
		
		if(hmap.isEmpty()) {
			System.out.println("HashMap is empty");
		}
		
		
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	    
	    hashmap.put(11,"Chaitanya");
	    hashmap.put(22,"Pratap");
	    hashmap.put(33,"Singh");
	    hashmap.put(44,"Rajesh");
	    hashmap.put(55,"Kate");
		
	    if(hashmap.containsKey(11)) {
	    	System.out.println("Key exists in hashmap");
	    }
	    else {
	    	System.out.println("Key doesn't exists in hashmap");
	    }
	    
		
	    if(hashmap.containsValue("Singh")) {
	    	System.out.println("Value exists in map");
	    }
	    else {
	    	System.out.println("Value doesn't exists in hashmap");
	    }
	    
	    System.out.println("Printing the keys of hashmap");
	    
	    Set<Integer> keys = hashmap.keySet();
	    Iterator itr = keys.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
		
	}
	
}
