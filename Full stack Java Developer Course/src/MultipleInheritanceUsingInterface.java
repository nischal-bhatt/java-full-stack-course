
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		
		eat a = new Dog();
		movement m  = new Dog();
		Animal2 m1 = new Dog();
	}
}

abstract class Animal2
{
	public String canWalk()
	{
		return "can walk";
	}
}

interface movement
{
	public String movementtype();
}

interface eat
{
	public String eatType();
}

class Dog extends Animal2 implements movement,eat
{

	@Override
	public String movementtype() {
		return "walks";
	}

	@Override
	public String eatType() {
		return "Chews";
	}
	
}