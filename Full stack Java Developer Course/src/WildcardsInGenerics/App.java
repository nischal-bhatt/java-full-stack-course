package WildcardsInGenerics;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public Vehicle(int vehicleId) {
		
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + vehicleId + "]";
	}
	
	
}

class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(22,"honda"));
		display(list);
		
	}
	
	                          //List<? super Car> list
	public static void display(List<? extends Vehicle> list) {
		
		for(Vehicle elem : list)
		{
			System.out.println(elem);
		}
	}
}
