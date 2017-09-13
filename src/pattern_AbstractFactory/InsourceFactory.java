package pattern_AbstractFactory;


public class InsourceFactory implements MotorFactory {

	public Bike getYahamaBike() {
		return new InYahama();
	}

	public Bike getDucatiBike() {
		return new InDucati();
	}

	public Car getBMWCar() {
		return new InBMW();
	}

	public Car getAudiCar() {
		return new InAudi();
	}

	

}
