package pattern_strategy;

public class Consumer {
	public static void main(String[] args) {
		IQuake q = new SimpleQuake();
		Ifly f = new SimpleFly();
		Idisplay  d = new SimpleDisplay();
		Duck simpleDuck = new Duck(q, f, d);
		simpleDuck.doDisplay();
		simpleDuck.dofly();
	}
}
