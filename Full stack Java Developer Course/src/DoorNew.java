
public class DoorNew {

	public boolean isLocked(String key)
	{
		class Lock {
			public boolean isLocked(String key)
			{
				if (key.equals("qwerty"))
				{
					return false;
				}else
				{
					return true;
				}
			}
		}
		
		//new Lock() is an anonymous object
		return new Lock().isLocked(key);
	}
}
