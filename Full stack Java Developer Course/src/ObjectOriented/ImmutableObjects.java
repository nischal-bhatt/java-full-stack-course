package ObjectOriented;

public class ImmutableObjects {
	public static void main(String[] args) {

		ImmutableObject a = new ImmutableObject(3);
		System.out.println(a.getX());
		
	}
}

class ImmutableObject 
{
	private int x;
	
	public ImmutableObject(int x)
	{
		this.x = x;
	}

	public int getX() {
		return x;
	}

	
	
	
}
