package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase1 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginError();
		

	}
	
	public static void loginError() throws Exception{
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,userName);
		userName.clear();
		userName.sendKeys("spk@spk.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		System.out.println("Test case 1 passed");
		
	}

}
