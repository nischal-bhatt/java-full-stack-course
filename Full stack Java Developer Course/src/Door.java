
public class Door {

	private Lock lock;
	public Door () {
		lock = new Lock(true);
	}
	
	
	
	
	public Lock getLock() {
		return lock;
	}




	public void setLock(Lock lock) {
		this.lock = lock;
	}




	public void shopStatus() 
	{
		if (lock.isLock())
		{
			System.out.println("shop is closed");
		}else
		{
			System.out.println("welcome!");
		}
	}
	
	class Lock {
		private boolean lock;

		public Lock(boolean lock) {
			
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
		
		
	}
}
