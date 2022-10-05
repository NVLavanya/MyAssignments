package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -1850;
		if (num <=0) {
			
			num = -num;
			System.out.println(num);
		}
		else
		{
			System.out.println("Not a negative number");
		}
	}

}
