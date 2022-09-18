package org.bank;

public class BankInfo {
	
	
	public static void saving(int val)
	{
		System.out.println(val);
		
		
	}
	public static void fixed ()
	{
		System.out.println("Fixed Deposit");
	}
	public static int deposit()
	{
		int dep=1000;
		System.out.println("Method Overridden " + dep);
		return dep;
		
	}

}
