package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase4B extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		gotoSalesForce();
		wrongUsernamePassword();

	}
    
	public static void wrongUsernamePassword() throws Exception{
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,userName);
		userName.clear();
		userName.sendKeys("fgdij@sdn");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("cbewjcew");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println("Test case passed: Please check your username and password");
		
	}
}
