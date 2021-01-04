package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase4A extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		forgotPassword();

	}
	
	public static void forgotPassword() throws Exception{
		
		waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='Forgot Your Password?']")));
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Your Password?']")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//input[@id='un']")));
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("spk@spk.com");
		waitExplicitly(10,driver.findElement(By.xpath("//input[@id='continue']")));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("Test case passed: password reset message is displayed");
	}
	
	

}
