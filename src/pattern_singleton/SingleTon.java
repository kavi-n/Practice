package pattern_singleton;

public class SingleTon {

	public static volatile SingleTon instance = null;
	
	private SingleTon(){
		
	}
	
	public String getName(){
		return "Single Ton";
	}
	
	public static SingleTon getInstance(){
		if(instance == null){
			synchronized (SingleTon.class) {
				if(instance == null){
					System.out.println("Inside Create Instance"); 
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}
	
}
