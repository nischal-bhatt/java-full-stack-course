package ObjectOriented;

public class EncapsulationExample {
	public static void main(String[] args) {

		Person3 a = new Person3();
		a.setAge(2);
		System.out.println(a.getAge());
		a.setAge(-2);
	}
}

class Person3
{
	private String name;
	private int age;
	private String gender;
	
	public Person3()
	{
		this.name = "John";
		this.age = 23;
		this.gender = "M";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
		{
		this.age = age;
		}else
		{
			System.out.println("can age be negative?");
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
