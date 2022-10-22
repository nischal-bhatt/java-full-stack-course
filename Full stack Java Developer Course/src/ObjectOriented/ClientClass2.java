package ObjectOriented;

public class ClientClass2 {
	public static void main(String[] args) {

		boy2 a = new boy2();
		System.out.println(a.type());
	}
}

class Person2 {
	
	public String type()
	{
		return "person";
	}
	
}

class boy2 extends Person2 {
	public String type()
	{
		return "boy";
	}
}

class girl2 extends Person2 {
	public String type()
	{
		return "girl";
	}
}
