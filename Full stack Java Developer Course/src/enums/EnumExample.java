package enums;

public class EnumExample {

	public static void main(String[] args) {
		hello hi = hello.COREJAVA;
		
		switch (hi)
		{
		case COREJAVA:
			System.out.println("corejava");
			break;
		case COLLECTIONS:
			System.out.println("colls");
			break;
		case GENERICS:
			System.out.println("gemerocs");
			break;
		case JSPANDSERVLETS:
			System.out.println("servlets");
			break;
		case MULTITHREADING:
			System.out.println("multithreading");
			break;
		}
	}
}

enum hello {
	COREJAVA,COLLECTIONS,GENERICS,JSPANDSERVLETS,MULTITHREADING
}