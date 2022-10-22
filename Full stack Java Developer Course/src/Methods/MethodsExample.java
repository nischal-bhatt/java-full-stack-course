package Methods;

public class MethodsExample {

	public static void main(String[] args) {
		
		printLoop(5,10);
		printLoop(27,30);
	}
	
	public static void printLoop(int startsWith,int lessThan)
	{
		
		while (startsWith <= lessThan)
		{
			System.out.println(startsWith);
			startsWith++;
		}
		System.out.println("--------");
	}
}
