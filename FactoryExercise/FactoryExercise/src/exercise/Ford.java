package exercise;

public class Ford extends Car{

	private String StreeringWheelPosition;
	
	public Ford(double engineCapacity, String fuelType, int yearOfProduction, String StreeringWheelPosition) {
		super(engineCapacity, fuelType, yearOfProduction);
		this.StreeringWheelPosition = StreeringWheelPosition;
	}
	
	public String getStreeringWheelPosition() {
		return StreeringWheelPosition;
	}

}
