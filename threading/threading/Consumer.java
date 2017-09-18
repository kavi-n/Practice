package threading;

public class Consumer {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 1;i<6;i++) {
			OneThread newThread = new OneThread(i);
			TwoThread twoThread = new TwoThread(i);
			Thread thread = new Thread(newThread);
			Thread thread2 = new Thread(twoThread);
			thread.start();
			thread2.start();
			System.out.println("new thread called "+thread.getName()+thread.getState());
			System.out.println("new thread2 called "+thread2.getName()+thread2.getState());
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("after join called "+thread.getName()+thread.getState());
			System.out.println("after join called "+thread2.getName()+thread2.getState());
		}
	
			new Thread(new Runnable() {
				public void run() {
					System.out.println("new thread");
				}
			}).start();
	}
}