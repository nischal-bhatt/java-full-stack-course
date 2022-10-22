package SOLIDDESIGNPRINCIPLES;

public class InterfaceSegregation {

	public static void main(String[] args) {
		//has to implement the method with a null return 
	}
}

class Car implements Vehicle{

	@Override
	public String TwoWheels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String FourWheels() {
		return "yes has four wheels!";
	}
	
}

interface Vehicle {
	public String TwoWheels();
	public String FourWheels();
}

interface TwoWheeledVehicle 
{
	public String TwoWheels();
}

interface FourWheeledVehicle
{
	public String FourWheels();
}


