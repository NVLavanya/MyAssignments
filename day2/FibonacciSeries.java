package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range =8, num1=0, num2=1, sum;
		System.out.println(num1);
		for(int i=1; i<=range; i++) 
		{
			sum= num1+num2;
			num1= num2;
			num2 =sum;
			System.out.println(sum);
		}

	}

}
