package Methods;

public class OverloadingClass {
	public static void main(String[] args) {

		ToShowOverLoading a = new ToShowOverLoading();
		System.out.println(a.doSomething());
		System.out.println(a.doSomething(77));
		System.out.println(a.doSomething("nish"));
	}
}

class ToShowOverLoading {

	public int doSomething()
	{
		return 2;
	}
	
	public int doSomething(int x)
	{
		return 2 + x;
	}
	
	public double doSomething(String x)
	{
		return 2.33;
	}
}
