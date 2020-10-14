package exercise;

public class CommonwealthFactory extends Factory{

	@Override
	public Ford buildFord(FordModel type) {

switch (type) {

case CMax:
	return new Ford(2.2, "disel", 1999, "LEFT");
case Focus:
	return new Ford(1.8, "petrol", 2002, "LEFT");
	default:
		throw new UnsupportedOperationException("No such type");	
		}
	}

	@Override
	public BMV buildBMV(BMVModel type) {
		switch(type) {
		case X5:
			return new BMV(2.2, "disel", 1999, "LEFT");
		case E60:
			return new BMV(1.8, "petrol", 2002, "LEFT");
			default:
				throw new UnsupportedOperationException("No such type");	
		
		}
	}

}
