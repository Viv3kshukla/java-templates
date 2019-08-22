//package designpatterns;
//
//
//class SimplePizzaFactory{
//	public Pizza createPizza(String type) {
//		Pizza pizza = null;
//		
//		if(type.equals("cheese")){
//			pizza = new CheesePizza();
//		}
//		else if(type.equals("peperoni")){
//			pizza = new CheesePizza();
//		}
//		else if(type.equals("calm")){
//			pizza = new CheesePizza();
//		}
//		else if(type.equals("veggie")){
//			pizza = new CheesePizza();
//		}
//		
//		return pizza;
//	}
//}
//
//public class PizzaStore {
//	SimplePizzaFactory factory;
//	
//	public PizzaStore(SimplePizzaFactory factory){
//		this.factory = factory;
//	}
//	
//	public Pizza orderPizza(String type) {
//		Pizza pizza;
//		
//		pizza = factory.createPizza(type);
//		
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
//		
//		return pizza;
//		
//	}
//}



//  Factory Method Pattern



//public abstract class PizzaStore{
//	public Pizza orderPizza(String type) {
//		
//		Pizza pizza = null;
//		
//		pizza = createPizza(type);
//		
//		pizza.prepare();
//		pizza.bake();
//		pizza.cut();
//		pizza.box();
//		
//		return pizza;
//		
//	}
//	
//	public abstract Pizza createPizza(String type);
//	
//}
//
//public class NYPizzaStore extends PizzaStore{
//	public Pizza createPizza(String item) {
//		if(item.equals("cheese")) {
//			return NYStyleCheesePizza();
//		}
//		else if(item.equals("peperoni")) {
//			return NYStylePeperoniPizza();
//		}
//		else if(item.equals("veggie")) {
//			return NYStyleVeggiePizza();
//		}
//		else if(item.equals("clam")) {
//			return NYStyleClamPizza();
//		}
//		else return null;
//	}
//}
//
//public class PizzaTestDrive{
//	public static void main(String args[]) {
//		PizzaStore nyStore = new NYPizzaStore();
//		Pizza pizza = nyStore.orderPizza("cheese");
//	}
//}


