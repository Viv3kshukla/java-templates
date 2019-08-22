package arraylists;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String args[]) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("vivek");
		obj.add("shukla");
		obj.add("harry");
		obj.add("steve");
		
		System.out.println("Original ArrayList");
		
		for(String str:obj) {
			System.out.println(str);
		}
		
		obj.add(0,"rahul");
		obj.add(1,"justin");
		
		System.out.println("ArrayList after add operation : ");
		
		for(String str: obj) {
			System.out.println(str);
		}
		
		obj.remove("rahul");
		
		System.out.println("ArrayList after remove operation ");
		
		for(String str: obj) {
			System.out.println(str);
		}
		
		obj.remove(1);
		
		System.out.println("Final ArrayList");
		for(String str:obj) {
			System.out.println(str);
		}
		
		System.out.println("ArrayList size "+ obj.size());
		
	}
	
}
