package week3.day1;

public class Students {
	public void getStudentInfo(int id) 
	{
	System.out.println("Student id: " +id);	
	}
	public void getStudentInfo(int id, String name) 
	{
	System.out.println("Student id: " +id + " Student id:" + name);	
	}
	public void getStudentInfo(String email, String phoneNumber) 
	{
	System.out.println("Student email: " +email + " Student phoneNumber:" + phoneNumber);	
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Students obj = new 	Students();
	obj.getStudentInfo(1212123);
	obj.getStudentInfo(112233, "Lavanya");
	obj.getStudentInfo("nvl@gmail.com", "9600396966");
	}

}
