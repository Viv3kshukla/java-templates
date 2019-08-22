package designpatterns;

class ExampleSingleton{
	private static ExampleSingleton uniqueInstance = null;
	private int data;
	
	
	private ExampleSingleton() {
		
	}
	
	public static ExampleSingleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ExampleSingleton();
		}
		
		return uniqueInstance;
	}
	
	public void setData(int x) {
		this.data = x;
	}
	
	public int getData() {
		return this.data;
	}
	
	
}

//class Singleton{    
//    private Singleton() {}
//     
//    private static class SingletonHolder {    
//        public static final Singleton instance = new Singleton();
//    }
// 
//    public static Singleton getInstance() {    
//        return SingletonHolder.instance;    
//    }
//}


class Singleton{
	
	private int data;
	
	private Singleton() {
		
	}
	
	
	private static class SingletonHolder{
		public static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
	
	
	public void setData(int x) {
		this.data = x;
	}
	
	public int getData() {
		return this.data;
	}
	
}


public class SingletonExample {
	
	public static void main(String args[]) {
		
//		ExampleSingleton example = ExampleSingleton.getInstance();
//		ExampleSingleton example2 = ExampleSingleton.getInstance();
//
//		example.setData(5);
//		
//		System.out.println(example2.getData());
//		
//		example2.setData(3);
//		
//		System.out.println(example.getData());
		
		
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		
		instance1.setData(5);
		System.out.println(instance2.getData());
		
		
		
	}
	
	
	
}
