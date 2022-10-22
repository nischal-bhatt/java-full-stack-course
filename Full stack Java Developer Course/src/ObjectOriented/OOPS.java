package ObjectOriented;

public class OOPS {

	public static void main(String[] args) {
		/*Car car = new Car();
		car.setSpeed(3);
		System.out.println(car.getSpeed());
		
		car.setDoors("closed");
		car.setEngine("on");
		System.out.println(car.getDoors());
		
		System.out.println(car.run());
		//there is nullpointer error.. how to solve this error?
	*/
		
		Car car = new Car();
		System.out.println(car.run());
		//this way, you can create immutable object
	
	    Car car2 = new Car("hi");
	    System.out.println(car2.run());
	    //why null pointer? 
	    
	    
	}
}
