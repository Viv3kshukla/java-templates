package hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student{
	
	private int rollNo;
	private String name;
	
	public void setRollNo(int roll) {
		this.rollNo = roll;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	

}

public class HmapExampleSecond {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Student> hmap = new HashMap<Integer,Student>();
		
		
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			int roll = scan.nextInt();
			String name = scan.next();
			Student stud = new Student();
			
			stud.setName(name);
			stud.setRollNo(roll);
			
			hmap.put(roll, stud);	
		}
		
		
		System.out.println("Enter the number of queries ");
		
		int q = scan.nextInt();
		
		while(q > 0) {
			q--;
			
			int checkRoll = scan.nextInt();
			if(hmap.containsKey(checkRoll)) {
				System.out.println("This Roll Exists");
			}
			else {
				System.out.println("This Roll does not Exists");
			}
		
		}
		
		// type 1
		
		for(Integer roll : hmap.keySet()) {
			System.out.print(hmap.get(roll).toString());
		}
		System.out.println();
		
		// type 2
		
		Set st = hmap.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext()) {
			
			Map.Entry entry = (Map.Entry)it.next();
			System.out.print(entry.getValue().toString());
		}
		System.out.println();
		
		String s = scan.next();
		
		
		
		
	}
}
