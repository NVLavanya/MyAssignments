package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("Deskop Size");
	}
	
	public static void main(String[] args) {
		 
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();
	
	}
}
