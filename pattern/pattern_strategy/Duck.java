package pattern_strategy;

public class Duck {

	IQuake quake;
	Ifly fly;
	Idisplay display;
	
	private Duck(){
		
	}
	
	public Duck(IQuake quake,Ifly fly,Idisplay display) {
		this.quake = quake;
		this.fly = fly;
		this.display = display;
	}
	
	public void dofly(){
		fly.fly();
	}
	
	public void doquake(){
		quake.quake();
	}
	
	public void doDisplay(){
		display.display();
	}
	
}
