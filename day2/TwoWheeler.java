package week1.day2;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 4;
	long chassisNumber = 1234567890l;
	boolean isPunctured = false;
	String bikeName = "Fasino";
	double runningKM = 14.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler obj = new TwoWheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
	}

}
