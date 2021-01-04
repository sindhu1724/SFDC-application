package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase35 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		removeTab();
		usernameDropDown();
		logout();
		gotoSalesForce();
		loginToSalesForce();
		checkAssetTab();
		
		

	}
	
	public static void removeTab() throws Exception{
		waitExplicitly(20,driver.findElement(By.xpath("//img[@alt='All Tabs']")));
		driver.findElement(By.xpath("//img[@alt='All Tabs']")).click();
		Thread.sleep(2000);
		//waitExplicitly(20,driver.findElement(By.xpath("(//input[@type='button'])[2]")));
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//option[@value='Asset']")));
		driver.findElement(By.xpath("//option[@value='Asset']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//img[@title='Remove']")));
		driver.findElement(By.xpath("//img[@title='Remove']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//input[@title='Save']")));
		driver.findElement(By.xpath("//input[@title='Save']")).click();
		
		
	}
	
	public static void checkAssetTab() throws Exception{
		
		boolean asset = driver.findElement(By.xpath("//a[normalize-space()='Assets']")).isDisplayed();
		System.out.println(asset);
	}

}
