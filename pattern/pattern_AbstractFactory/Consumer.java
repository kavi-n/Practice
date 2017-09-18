package pattern_AbstractFactory;

public class Consumer {

	public static void main(String[] args) {
		
		InsourceFactory in = new InsourceFactory();
		
		OutsourceFactory out = new OutsourceFactory();
		
		System.out.println(in.getAudiCar().getName());
		
		System.out.println(out.getYahamaBike().getBikeName());
		
		
	}
	
}
