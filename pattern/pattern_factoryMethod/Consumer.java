package pattern_factoryMethod;

public class Consumer {

	public static void main(String[] args) {
		
		FactoryInterface cf = new CarFactory();
		Car bmw = cf.getCar("BMW");
		System.out.println(bmw.getName());
		Car audi = cf.getCar("Audi");
		System.out.println(audi.getName());
	}
	
}
