package SOLIDDESIGNPRINCIPLES;

import java.util.ArrayList;
import java.util.List;

public class DependencyInversion {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		ObjectReturner r = new ObjectReturner();
		list.add(r.returnObject("tiger"));
		list.add(r.returnObject("cat"));
		list.add(r.returnObject("tiger"));
		list.add(r.returnObject("tiger"));
		for (Animal a : list)
		{
			System.out.println(a.makesNoise());
		}
	}
}

interface Animal {
	public String makesNoise();
	
	
	
	
		
	
}

class Cat implements Animal {
	public String makesNoise()
	{
		return "meow";
	}
}

class Dog implements Animal {
	public String makesNoise()
	{
		return "woof";
	}
}

class Tiger implements Animal {
	public String makesNoise()
	{
		return "roar";
	}
}

class ObjectReturner
{
	public Animal returnObject(String x)
	{
		if (x.equals("dog"))
		{
			return new Dog();
		}else if (x.equals("cat"))
		{
			return new Cat();
		}else {
			return new Tiger();
		}
	}
}
