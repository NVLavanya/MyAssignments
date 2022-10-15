package week3.day1;

public class LearnOverloading {
 
	public void add (int a, int b)
	{
	System.out.println("add numbers ->" + (a+b));
	}
	public void add (int a, int b, int c)
	{
		System.out.println("add numbers ->" + (a+b+c));
	}
	public void add (float a, float b)
	{
		System.out.println("add numbers ->" + (a+b));
	}
	public void add (float a, int b)
	{
		System.out.println("add numbers ->" + (a+b));
	}
	
	public static void main(String[] args) {
	 
		LearnOverloading obj = new LearnOverloading();
		obj.add(2, 3);
		obj.add(10, 100, 20);
		obj.add(2.5f, 10.5f);
		obj.add(20.5f, 10);
	
	
	}

}
