package pattern_commander;

public class LightCommand implements ICommand {

	private Light light;
	
	public LightCommand(Light light){
		this.light = light;
	}
	
	
	public void execute() {
		light.switchOnLight();
	}

	public void unExecute() {
		light.switchOffLight();
	}

}
