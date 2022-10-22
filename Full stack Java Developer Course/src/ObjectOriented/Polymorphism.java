package ObjectOriented;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
	public static void main(String[] args) {

		List<Animal4> animals= new ArrayList<>();
		animals.add(new bird());
		animals.add(new reptile());
		for (Animal4 hi : animals)
		{
			hi.printSomething();
		}
	}
}

class Animal4 {
	
	public void printSomething()
	{
		System.out.println("hi");
	}
}

class bird extends Animal4 {
	//public void printSomething()
	//{
//		System.out.println("bird says");
	//}
}

class reptile extends Animal4 {
	public void printSomething()
	{
		System.out.println("reptile says");
	}
}