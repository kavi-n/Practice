package pattern_factoryMethod;

public class CarFactory implements FactoryInterface {

	public Car getCar(String type){
		Car car = null;
		if(type.equals("BMW")){
			car = new BMW();
		}else if(type.equals("Audi")){
			car = new Audi();
		}
	return car;
	}
	
}
