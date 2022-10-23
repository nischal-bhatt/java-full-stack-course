
abstract class LockAnon {
	public abstract boolean isUnlocked(String key);
}

public class DoorAnon {
	public static void main(String[] args) {
		DoorClassAnon abc = new DoorClassAnon();
		LockAnon r = abc.getA();
		System.out.println(r.isUnlocked("qwerty"));
				
				
	}
}

 class DoorClassAnon {

	 LockAnon a = new LockAnon() {

		@Override
		public boolean isUnlocked(String key) {
			if (key.equals("qwerty"))
			{
				return true;
			}else
			{
				return false;
			}
		}
		 
	 };

	public LockAnon getA() {
		return a;
	}

	public void setA(LockAnon a) {
		this.a = a;
	}
	 
	 
}
