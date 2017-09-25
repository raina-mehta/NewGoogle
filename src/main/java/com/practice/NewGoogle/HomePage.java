package com.practice.NewGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
	WebDriver driver;

public void clickOnGmail()
{
	WebDriverWait wait= new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gb_P"))).click();
	System.out.println("This is branch1");
	
	
}

public void clickCreateAccount()
{
	
	WebDriverWait wait= new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CREATE AN ACCOUNT"))).click();
	
}





	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

}
