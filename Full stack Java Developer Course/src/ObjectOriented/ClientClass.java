package ObjectOriented;

public class ClientClass {
	public static void main(String[] args) {
		Lorry l = new Lorry();	
		Bus b = new Bus("hi");
	}
   
}

class Lorry {
	public Lorry() {
           System.out.println("called?");		
	}
}


class Bus {
	public Bus()
	{
		System.out.println("default");
	}
	
	public Bus(String x) 
	{
		this(); //calling default constructor
		System.out.println("not defaul");
	}
}
