package ObjectOriented;

public class AbstractClassExample {

	public static void main(String[] args) {
		// is a -- use abstract class
		// can - then use interface
		
		Animal a = new Dog();
		System.out.println(a.movementType());
		System.out.println(a.canWalk());
	}
}

abstract class Animal 
{
	public String canWalk()
	{
		return "this animal can walk";
	}
	
	public abstract String movementType();
}

class Dog extends Animal {

	@Override
	public String movementType() {
		return "Runs";
	}
	
}
