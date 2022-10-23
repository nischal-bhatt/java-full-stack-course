
public class FinalKeywordMethod {
	public static void main(String[] args) {

		B1 obj = new B1(12);
		obj.india();
		obj.USA();
	}
}

class B1 extends A1 {
	private final int x;
	
	public B1(int x)
	{
		super();
		this.x  = x;
	}
	
	public int getX()
	{
		return x;
	}
	
	//can override
	public void india()
	{
		System.out.println("hey - overridden");
	}
	
	
}
// cannot override final class
class A1 {
	
	public void india() {
		System.out.println("india is amazing");
	}
	
	//cannot override
	public final void USA() {
		System.out.println("USA is fantastic");
	}
}