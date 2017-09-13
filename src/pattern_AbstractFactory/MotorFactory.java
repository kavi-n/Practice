package pattern_AbstractFactory;

public interface MotorFactory {

	public Bike getYahamaBike();
	
	public Bike getDucatiBike();
	
	public Car getBMWCar();
	
	public Car getAudiCar();
	
}
