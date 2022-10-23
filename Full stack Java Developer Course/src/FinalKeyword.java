
public class FinalKeyword {

	public static void main(String[] args) {
		B b = new B("xxx");
		System.out.println(b.getX());
		
		
	}
}

class A {
	private final int x;
	
	public A(int r)
	{
		this.x = r;
	}

	public int getX() {
		return x;
	}
	
	
}

class B extends A {
	public B(String x)
	{
		super(30);
	}
}
