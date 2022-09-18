package org.bank;

	public class AxisBank extends BankInfo {
	
		public static int deposit(int depAmt)
		{
			
			System.out.println("Called int " + depAmt);
			return depAmt;
			
		}
		
		public static double deposit(double str)		//Overridden the method deposit(BankInfo class)
		{
			
			System.out.println("Called double " + str);
			return str=300;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deposit(5);
		deposit(5.33);
		saving(565);
		deposit();
		

	}

}
