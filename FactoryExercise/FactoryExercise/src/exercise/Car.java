package exercise;

public abstract class Car {

	double engineCapacity;
	String fuelType;
	int yearOfProduction;
	public Car(double engineCapacity, String fuelType, int yearOfProduction) {
		super();
		this.engineCapacity = engineCapacity;
		this.fuelType = fuelType;
		this.yearOfProduction = yearOfProduction;
	}
	
}
