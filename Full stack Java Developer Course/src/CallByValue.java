
class Operation {
	void change(int data)
	{
		data = data + 100;
	}
}

class OperationObject {
	void change(Person p)
	{
		p.setName("john");
	}
}

public class CallByValue {

	public static void main(String[] args) {
		int data1 = 0;
		
		System.out.println(data1);
		
		Operation o = new Operation();
		o.change(data1);
		
		System.out.println(data1);
		
		Person p = new Person();
		p.setName("nish");
		System.out.println(p.getName());
		
		OperationObject oo = new OperationObject();
		System.out.println(p);
		//passing the address of object p
		oo.change(p);
		
		System.out.println(p.getName());
		//primitives are passed by value, objects are passed by reference
	}
}

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
