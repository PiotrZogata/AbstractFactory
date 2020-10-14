package exercise;

public abstract class Factory {

	abstract public Ford buildFord(FordModel type);
	
	abstract public BMV buildBMV(BMVModel type);
}
