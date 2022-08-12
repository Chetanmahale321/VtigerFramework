package Practise1;

import org.testng.annotations.Test;

public class Sample1 {

	
	@Test
	public void createContact()
	{
		System.out.println("contact created");
	}
	@Test(invocationCount=3)
	public void modifyContact()
	{
		System.out.println("modified contact");
	}
	@Test
	public void DeleteContact()
	{
		System.out.println("delete contact");
	}


}
