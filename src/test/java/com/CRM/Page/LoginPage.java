package com.CRM.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email=By.id("email-id");
	By id=By.id("password");
	By btn=By.name("submit-name");
	
	
	public String doLogin(String us,String psw)
	{
		driver.findElement(email).sendKeys(us);
		driver.findElement(id).sendKeys(psw);
		driver.findElement(btn).click();
		
		return driver.getCurrentUrl();
	}
}
