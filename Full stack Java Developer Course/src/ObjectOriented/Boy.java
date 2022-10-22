package ObjectOriented;

public class Boy {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("nish");
		System.out.println(p);
	}
}

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
