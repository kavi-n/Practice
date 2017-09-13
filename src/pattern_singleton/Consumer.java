package pattern_singleton;

public class Consumer {

	public static void main(String[] args) {
		System.out.println(SingleTon.getInstance().getName());
		System.out.println(SingleTon.getInstance().getName());
	}
	
}
