package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase26 extends HackathonUtility{

	public static void main(String[] args) throws Exception{
		
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		newViewContact();
		

	}
	
	public static void newViewContact() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Create New View']")));
		driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("new_Contact");
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("(//input[@class='btn primary'])[2]")));
		driver.findElement(By.xpath("(//input[@class='btn primary'])[2]")).click();
		
	}

}
