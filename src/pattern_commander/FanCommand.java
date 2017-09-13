package pattern_commander;

public class FanCommand implements ICommand {

	private Fan fan;
	
	public FanCommand(Fan fan){
		this.fan = fan;
	}
	
	public void execute() {
		fan.switchOnFan();
	}

	public void unExecute() {
		fan.switchOffFan();
	}

	
	
}
