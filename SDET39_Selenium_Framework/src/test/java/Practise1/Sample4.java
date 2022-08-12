package Practise1;

import org.testng.annotations.Test;

public class Sample4 {

	@Test
	public void createContact()
	{
		System.out.println("contact created");
	}
	@Test(dependsOnMethods="createContact")
	public void modifyContact()
	{
		System.out.println("modified contact");
	}
	@Test(dependsOnMethods="modifyContact")
	public void DeleteContact()
	{
		System.out.println("delete contact");
	}


}


