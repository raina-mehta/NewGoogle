package com.practice.NewGoogle;

import org.openqa.selenium.WebDriver;

public class CreateAccountPage 
{
	WebDriver driver;


public String getUrl()
{
	System.out.println("This is branch1");
	return driver.getCurrentUrl();
	
}

	public  CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
}
