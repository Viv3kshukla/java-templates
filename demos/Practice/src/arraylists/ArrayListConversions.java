package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConversions {
	
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("vivek");
		list.add("shukla");
		list.add("harry");
		list.add("olsen");
		
		String [] arr = new String[list.size()];
		for(int j=0;j<arr.length;j++) {
			arr[j] = list.get(j);
		}
		
		for(String k : arr) {
			System.out.println(k);
		}
		
		String arrlist [] = list.toArray(new String[list.size()]);
		
		for(String str: arr) {
			System.out.println(str);
		}
		
		
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList(arrlist));
		
		for(String str : newList) {
			System.out.println(str);
		}
		

	}
	
	
}
