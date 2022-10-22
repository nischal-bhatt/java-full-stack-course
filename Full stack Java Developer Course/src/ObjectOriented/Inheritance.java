package ObjectOriented;

public class Inheritance {
	public static void main(String[] args) {

		CarV v = new CarV();
		v.setEngine("this is an engine");
		System.out.println(v.getEngine());
		System.out.println(v.getType());
	}
}

class Vehicle {

	public Vehicle(String type)
	{
		//System.out.println("this is a " + type);
	    this.type = type;
	}
	private String type;
	private String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}

class CarV extends Vehicle {
	
	public CarV()
	{
		super("car");
	}
}
