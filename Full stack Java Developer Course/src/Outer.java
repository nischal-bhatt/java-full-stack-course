
public class Outer {

	private static int testVar = 5;
	
	private static void testOuterMethod()
	{
		System.out.println("hey!");
		System.out.println(Inner.x);
	}
	
	public static class Inner {
		public static int x = 0;
		public static void testingInnerMethod() {
			System.out.println("testing");
			System.out.println(testVar);
			testOuterMethod();
		}
	}
}
