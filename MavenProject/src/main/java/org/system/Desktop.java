package org.system;

public class Desktop extends Computer		//Single Inheritance
	{ 
	
	public static void desktopSize()
	{
		System.out.println("You called the method desktopSize");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		computerModel();	//Call Parent class method
		desktopSize();		//Call derived class method

	}

}
