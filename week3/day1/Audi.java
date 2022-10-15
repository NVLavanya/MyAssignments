package week3.day1;

public class Audi extends Car {
	public void hybridFuel() {

		System.out.println("Having hybridFuel option");
	}
	
	public void applyBreak() {
		
		System.out.println("ABS Break");
	}
	
	public void overRide() {
	this.applyBreak();
	super.applyBreak();
	}

}
