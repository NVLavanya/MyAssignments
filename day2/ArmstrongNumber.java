package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =153;
		int a =1, b= 0 , c=value;
		while (c!=0) {
			
			a= c%10;
			b=b+(a*a*a);
			c=c/10;
			
		}
		
		if (value ==b)
		{
			System.out.println("Its Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
		}
	}

}
