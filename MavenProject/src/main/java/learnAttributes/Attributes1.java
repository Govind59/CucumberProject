package learnAttributes;

import org.testng.annotations.Test;

public class Attributes1 {
	@Test
	public void createLead()
	{
		System.out.println("1");
	}
	@Test(enabled=false)
	public void editLead()
	{
		System.out.println("2");
	}
	@Test(enabled=true)
	public void deleteLead()
	{
		System.out.println("3");
	}
	@Test(priority=11)
	public void duplicateLead()
	{
		System.out.println("4");
	}
	
	@Test(priority=12)
	public void login()
	{
		System.out.println("0");
	}
	
	@Test(priority=9)
	public void logins()
	{
		System.out.println("0");
	}



}

