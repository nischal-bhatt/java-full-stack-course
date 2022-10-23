package StringPackage;

public class StringExample {

	public static void main(String[] args) {
		String x = "study";
		String y = "easy";
		String z = x + y;	
		System.out.println(z);
		
		if (z == "studyeasy") //not comparing the contents, but seeing whether the object is the same, which it isnt
		{
			System.out.println("in here");
		}else
		{
			System.out.println("now in here");
		}
		
		String r = "ord";
		String j = "ord";
		// there is only 1 object created, both references point to it.
		if (r == j)
		{
			System.out.println("right in here");
		}
		
		String str1 = "hello world"; //string literal
		System.out.println(str1);
		
	}
	
	
	
}
