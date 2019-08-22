package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListInit {
	
	
	public static void main(String args[]) {
		
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Pratap","Peter","Angelo"));
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		arr.clear();
		
		arr.add("vivek");
		arr.add("shukla");
		
		it = arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}
	
}
