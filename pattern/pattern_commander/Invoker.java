package pattern_commander;

public class Invoker {

	ICommand fanCommand;
	
	ICommand lightCommand;

	
	public Invoker(ICommand fanCommand,ICommand lightCommand) {
		this.fanCommand = fanCommand;
		this.lightCommand = lightCommand;
	}
	
	public void fanOn(){
		fanCommand.execute();
	}
	
	public void fanOff(){
		fanCommand.unExecute();
	}
	
	public void lightOn(){
		lightCommand.execute();
	}
	
	public void lightOff(){
		lightCommand.unExecute();
	}
	
}
