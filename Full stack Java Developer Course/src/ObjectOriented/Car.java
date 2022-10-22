package ObjectOriented;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car()
	{
		System.out.println("called?");
		this.doors = "closed";
		this.engine = "on";
		this.speed = 30;
	}
	
	public Car(String doors)
	{
		this.doors = "closed";
	}
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run()
	{
		if (doors.equals("closed") && engine.equals("on") && this.speed > 0)
		{
			return "running";
		}else
		{
			return "not running";
		}
	}
	
	
}
