package multithreading;

public class MultiThreadingAppClass {

	public static void main(String[] args) {
		
		MyCounter counter = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
	
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	    counter.start();
	    counter2.start();
	   
	    try {
			counter.join();
			counter2.join();
	    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    long endTime = System.currentTimeMillis();
	    System.out.println(endTime);
	   
	    
	    System.out.println(endTime-startTime);
	}
}


class MyCounter extends Thread{
	private int threadNo;

	public void run() {
		countMe();
	}
	
	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}
	
	public void countMe() {
		for (int i = 1; i<9; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("the value of i is " + i + " and thread number is " + threadNo);
		}
	}
	
	
}
