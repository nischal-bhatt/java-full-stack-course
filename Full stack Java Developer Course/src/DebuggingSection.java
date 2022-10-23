
public class DebuggingSection {

	public static void main(String[] args) {
		
		int x = 5, y= 0, z;
		z = x/y;
		System.out.println(z);
		
		Nish nish = new Nish();
		nish.setAge(33);
		System.out.println(nish.getAge());
		
		
		
	}
}


class Nish 
{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

