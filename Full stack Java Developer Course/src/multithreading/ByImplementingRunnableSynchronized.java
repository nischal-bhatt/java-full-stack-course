package multithreading;

class Brakets {
	synchronized public void generate() 
	{
		for (int i =1; i<=10; i++)
		{
			if (i <= 5)
			{
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}

public class ByImplementingRunnableSynchronized {
	public static void main(String[] args) {
		
		Brakets b = new Brakets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i =1; i<=5; i++)
				{
					b.generate();
				}
			}
			
		}).start();
		
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i =1; i<=5; i++)
				{
					b.generate();
				}
			}
			
		}).start();
	}
}