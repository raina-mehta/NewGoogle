package com.practice.NewGoogle;

import org.openqa.selenium.WebDriver;

public class CreateAccountPage 
{
	WebDriver driver;


public String getUrl()
{
	
	return driver.getCurrentUrl();
	
}

	public  CreateAccountPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	
}
