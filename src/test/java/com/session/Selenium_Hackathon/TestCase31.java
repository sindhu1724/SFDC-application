package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase31  extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		checkCancleInCreateNewView();
	}
	
	public static void checkCancleInCreateNewView() throws Exception{
		
		
		waitExplicitly(20,driver.findElement(By.linkText("Create New View")));
		driver.findElement(By.linkText("Create New View")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABCD");
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).clear();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFDH");
		waitExplicitly(20,driver.findElement(By.xpath("(//input[@name='cancel'])[1]")));
		driver.findElement(By.xpath("(//input[@name='cancel'])[1]")).click();
		System.out.println("contact page displayed");
		
		
	}

}
