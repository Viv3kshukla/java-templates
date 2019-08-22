package codings;

class A{
	A(){
		System.out.println("Class A Constructor");
	}
	public void print() {
		System.out.println("A's method");
	}
}

class B extends A{
	B(){
//		super();
		System.out.println("Class B Constructor");
	}
	public void print() {
		super.print();
		System.out.println("B's method");
	}
	
}


public class Runner1 {
	public static void main(String args[]) {
		
		A obj1 = new B();
//		B obj2 = new B();
		A obj3 = new A();
		
		obj1.print();
		obj3.print();
		
	}
}
