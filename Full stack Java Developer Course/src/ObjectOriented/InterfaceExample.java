package ObjectOriented;

public class InterfaceExample {
	public static void main(String[] args) {

		Phone p = new Samsung();
		System.out.println(p.processor());
	}
}

interface Phone 
{
	public String processor();
}

class Samsung implements Phone
{

	@Override
	public String processor() {
		// TODO Auto-generated method stub
		return "SD835";
	}
	
}