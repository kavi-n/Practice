package pattern_commander;

public class Consumer {

	public static void main(String[] args) {
		Light l = new Light();
		Fan f = new Fan();
		Invoker remote = new Invoker(new FanCommand(f), new LightCommand(l));
		remote.fanOn();
		remote.lightOff();
	}
	
}
