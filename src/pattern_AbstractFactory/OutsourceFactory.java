package pattern_AbstractFactory;


public class OutsourceFactory implements MotorFactory {

	public Bike getYahamaBike() {
		return new OutYahama();
	}

	public Bike getDucatiBike() {
		return new OutDucati();
	}

	public Car getBMWCar() {
		return new OutBMW();
	}

	public Car getAudiCar() {
		return new OutAudi();
	}

}
