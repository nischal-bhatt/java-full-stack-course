package multithreading;

class MyCounterNew implements Runnable{
	private int threadNo;
	
	public MyCounterNew(int threadNo )
	{
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		for (int i = 0; i<= 9; i++)
		{
			System.out.println("thread if " + threadNo);
		}
		
	}
}

public class ByImplementingRunnable {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyCounterNew(1));
		Thread thread2 = new Thread(new MyCounterNew(2));
		thread1.start();
		thread2.start();
		
	}
}
