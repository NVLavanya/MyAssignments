package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value =79;
		boolean flag = false;
		for (int i=2; i<=(value/2);i++) {
			if(value%i==0) 
			{				
				flag=true;
				break;
			}
		}
		if (flag == false)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}

}
