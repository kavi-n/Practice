package threading;


public class OneThread implements Runnable {

	private int count;
	
	public OneThread(int ThreadCount) {
		count = ThreadCount;
		//new Thread(this).start();
	}
	
	public OneThread() {
	}

	public void run() {
		try {
			synchronized(this)  {
				this.notifyAll();
			}
			Thread.sleep(20000);
			System.out.println("Thread Executed "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
