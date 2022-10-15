package week3.day1;

public class MyVehicle extends Audi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.applyBreak();
		c.soundHorn();
		c.openSunroof();
		c.turnOnAC();
		System.out.println("******************************");
		Auto auto = new Auto();
		auto.handStarter();
		auto.applyBreak();
		auto.soundHorn();
		System.out.println("******************************");
		BMW bmw = new BMW();
		bmw.applyBreak();
		bmw.soundHorn();
		bmw.openSunroof();
		bmw.turnOnAC();
		bmw.autoPark();
		System.out.println("******************************");
		Audi audi =new Audi();
		audi.applyBreak();
		audi.soundHorn();
		audi.openSunroof();
		audi.turnOnAC();
		audi.hybridFuel();
		System.out.println("******************************");
		Bajaj baj = new Bajaj();
		baj.applyBreak();
		baj.soundHorn();
		baj.handStarter();
		baj.electronicMeter();
		System.out.println("******************************");
		audi.overRide();	
	}

}
