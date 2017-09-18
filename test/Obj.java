import java.math.BigDecimal;

public class Obj {

	private String a;
	
	private String d;

	public static void main(String[] args) {
		BigDecimal round_off = new BigDecimal("0.05");
		BigDecimal b = new BigDecimal("31.7");
		b = b.divide(round_off);
		b = new BigDecimal(Math.ceil(b.doubleValue()));
		b = b.multiply(round_off);
		System.out.println(b);	
	}	
	
	
}
