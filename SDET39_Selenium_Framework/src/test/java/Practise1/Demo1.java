package Practise1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {

	@Test(retryAnalyzer = com.crm.GenericUtility.RetryImpClass.class)
	public void modifyContact()
	{
		Assert.assertEquals(false, true);
		System.out.println("modified contact");
	}
}
