package Practise1;

import org.testng.annotations.Test;

public class Sample3 {

		@Test(priority=2)
		public void createContact()
		{
			System.out.println("contact created");
		}
		@Test(priority=1)
		public void modifyContact()
		{
			System.out.println("modified contact");
		}
		@Test(priority=3)
		public void DeleteContact()
		{
			System.out.println("delete contact");
		}
   }


