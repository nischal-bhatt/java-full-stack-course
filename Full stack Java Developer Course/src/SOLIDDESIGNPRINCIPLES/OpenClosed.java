package SOLIDDESIGNPRINCIPLES;

public class OpenClosed {

	public static void main(String[] args) {
		Employee a = new Employee("perm");
		System.out.println(a.returnBonus());	
	
		Employee b = new ContractEmployee("temp");
		System.out.println(b.returnBonus());
		
		Employee c = new AnotherTypeOfEmployee("another");
		System.out.println(c.returnBonus());
	
	}
	
}

class Employee {
	
	String empType;
	
	public Employee(String empType)
	{
		this.empType = empType;
	}
	
	public String returnBonus()
	{
	    if (this.empType.equals("perm"))
	    {
	       return "300";	
	    }
	    return null;
	}
}

class ContractEmployee extends Employee 
{

	public ContractEmployee(String empType) {
		super(empType);
		
	}
	
	public String returnBonus()
	{
		if (this.empType.equals("temp"))
		{
			return "800";
		}
		return null;
	}
	
}

class AnotherTypeOfEmployee extends Employee 
{

	public AnotherTypeOfEmployee(String empType) {
		super(empType);
		// TODO Auto-generated constructor stub
	}
	
	public String returnBonus()
	{
		if (this.empType.equals("another"))
		{
			return "700";
		}
		return null;
	}
	
}


