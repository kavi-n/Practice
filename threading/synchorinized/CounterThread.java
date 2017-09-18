package synchorinized;

public class CounterThread extends Thread {

	protected Counter counter = null;

    public CounterThread(Counter counter){
       this.counter = counter;
    }

    public void run() {
    	synchronized (CounterThread.class) {
    		for(int i=0; i<10; i++){
    	          counter.add(i,Thread.currentThread().getName());
    	       }
		}
    }
	
}
