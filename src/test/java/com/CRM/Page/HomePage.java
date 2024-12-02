package com.CRM.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	//encapsulation=private data+public methods
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By link=By.linkText("Sign In");
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getStatusOfLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();  //https://automationplayground.com/crm/login.html
	}
}
