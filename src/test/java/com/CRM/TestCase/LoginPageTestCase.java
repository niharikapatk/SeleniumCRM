package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTestCase extends BaseClass{
	@Test
	public void pageSetUp()
	{
		hp.getStatusOfLink();
	}
	
	@Test
	public void validateLogin()
	{
		String url = lp.doLogin("patkniharika@gmail.com", "Niharika@13");
		Assert.assertTrue(url.contains("customers"),"Test Fail: Login fail");
		
		System.out.println("Test pass:test case pass");
		
		
	}
  
  
}
