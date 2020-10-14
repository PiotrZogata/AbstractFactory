package exercise;

public class BMV extends Car {

	private String StreeringWheelPosition;
	
	protected BMV(double engineCapacity, String fuelType, int yearOfProduction, String StreeringWheelPosition) {
		super(engineCapacity, fuelType, yearOfProduction);
		this.StreeringWheelPosition = StreeringWheelPosition;
	}
	
	public String getStreeringWheelPosition() {
		return StreeringWheelPosition;
	}

}
