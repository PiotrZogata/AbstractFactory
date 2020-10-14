package main;

import exercise.BMV;
import exercise.BMVModel;
import exercise.CommonwealthFactory;
import exercise.ContinentalFactory;
import exercise.Factory;
import exercise.Ford;
import exercise.FordModel;

public class Main {

	public static void main(String[] args) {
		
		Factory commonwealthFactory = new CommonwealthFactory();
		Factory continentalFactory = new ContinentalFactory();
		
		BMV bmv = commonwealthFactory.buildBMV(BMVModel.E60);
		System.out.println(bmv.getStreeringWheelPosition());
		
		BMV bmv1 = continentalFactory.buildBMV(BMVModel.E60);
		System.out.println(bmv1.getStreeringWheelPosition());
		
		Ford ford = continentalFactory.buildFord(FordModel.CMax);
		System.out.println(ford.getStreeringWheelPosition());
		
		Ford ford1 = commonwealthFactory.buildFord(FordModel.Focus);
		System.out.println(ford1.getStreeringWheelPosition());

	}

}
