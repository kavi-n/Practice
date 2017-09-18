package pattern_factoryMethod;

public class BMW extends Car{

	@Override
	public String getName() {
		return "BMW";
	}

	@Override
	public String engine() {
		return "100PSI";
	}

}
