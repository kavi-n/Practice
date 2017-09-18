package pattern_factoryMethod;

public class Audi extends Car {

	@Override
	public String getName() {
		return "Audi";
	}

	@Override
	public String engine() {
		return "5000PSI";
	}

}
