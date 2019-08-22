package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class MyCompare implements Comparator<String>{
	public int compare(String a,String b) {
		return b.compareTo(a);
	}
}

public class ArrayListSort {
	
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("India","China","Korea","Japan"));
		
		System.out.println("Before sorting");
		for(String str : list) {
			System.out.println(str);
		}
		
		Collections.sort(list);
		System.out.println("After sorting");
		for(String str: list) {
			System.out.println(str);
		}
		
//		Collections.reverse(list);
		Comparator<String> myCompare = new MyCompare();
		
		// for functional interfaces
		
		Comparator<String> comp = (String a,String b)-> {
			return b.compareTo(a);
		};
		
		Comparator<String> comp1 = (a,b)-> b.compareTo(a);
		
		
		Collections.sort(list, comp1);
		
		System.out.println("After resorting");
		for(String str: list) {
			System.out.println(str);
		}
		
		
		
		
	}
	
}
