package week1.day2;

public class Car {

		public void printCarName() {
			System.out.println("Tata-Punch");
		}
		
		public int getRegNumber(int regNo) {
			//regNo=1234;
			return regNo;
		}
		public String 	getColor(String carColor) {
			//carColor= "White";
			return carColor;
		}
		public boolean isCarPuncture() {
			boolean puncture = false;
			return puncture;
		}
		public int addNumbers(int num1, int num2, int num3) {
			return num1+num2+num3;
		}
		private int subNumbers (int a, int b) {
			return a-b;
		}
		float mulNumbers(float a, float b, float c) {
			return a*b*c;
		}
		public int divNumbers (int a, int b) {
			return a/b;
		}
 public static void main(String[] args) {
	 
	 Car obj = new Car();
	 obj.printCarName();
	 int regNo = obj.getRegNumber(1111);
	 System.out.println(regNo);
	 String carColor = obj.getColor("Red");
	 System.out.println(carColor);
	 System.out.println(obj.isCarPuncture());
	 int addNo = obj.addNumbers(2, 3, 5);
	System.out.println(addNo);
	int subNo = obj.subNumbers(4, 2);
	System.out.println(subNo);
	float mulNo = obj.mulNumbers(2.2f, 1.2f, 2.2f);
	System.out.println(mulNo);
	int divNo = obj.divNumbers(8, 2);
	System.out.println(divNo);
 }
}
