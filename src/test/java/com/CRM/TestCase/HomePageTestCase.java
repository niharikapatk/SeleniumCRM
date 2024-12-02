package com.CRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Page.HomePage;

public class HomePageTestCase extends BaseClass {
  
  
  @Test(priority=1)
  public void verifyUrl()
  {
	  
	  String actUrl = hp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("crm"));
	  System.out.println("Test case 1:URL matched");
	  
  }

  @Test(priority=2)
  public void verifyTitle()
  {
	  String actTitle = hp.getAppTitle();
	  Assert.assertTrue(actTitle.contains("Customer"),"Test case 2:Title not matched");
	  System.out.println("Test case 2:Title matched");
	  
  }
  
  @Test(priority=3)
  public void validateSIgnInLink()
  {
	   String link1 = hp.getStatusOfLink(); //https://automationplayground.com/crm/login.html
	  Assert.assertTrue(link1.contains("login"),"Test case 3:Login page not opened");
	  System.out.println("Test case 2:Title matched");
  }
}
