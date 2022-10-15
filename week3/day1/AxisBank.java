package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit()
	{
		super.deposit();
		//System.out.println("Deposit- Axis bank");
	}
	
	public static void main(String[] args) {
	
		AxisBank obj = new AxisBank();
		obj.deposit();
	}
	

}
