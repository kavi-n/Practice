package threading;


public class TwoThread implements Runnable {

	private int count;
	
	public TwoThread(int ThreadCount) {
		count = ThreadCount;
		//new Thread(this).start();
	}
	
	public TwoThread() {
	}

	public void run() {
		try {
			Thread.sleep(10000);
			System.out.println("Thread Executed "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
