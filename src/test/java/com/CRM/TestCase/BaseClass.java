package com.CRM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.CRM.Page.HomePage;
import com.CRM.Page.LoginPage;

public class BaseClass {

	private WebDriver driver;
	public HomePage hp;
	public LoginPage lp;
	@BeforeTest
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
		
	}
}
