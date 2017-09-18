package synchorinized;

public class Counter {

	long count = 0;
    
    public void add(long value,String name){
      this.count += value;
      System.out.println(name+" "+this.count);
    }
	
}
