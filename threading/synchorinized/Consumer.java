package synchorinized;

public class Consumer {
	public static void main(String[] args) throws InterruptedException{
	      Counter counter = new Counter();
	      Thread  threadA = new CounterThread(counter);
	      Thread  threadB = new CounterThread(counter);
	      threadA.start();
	      //threadA.join();
	      threadB.start(); 
	    }
	
}
