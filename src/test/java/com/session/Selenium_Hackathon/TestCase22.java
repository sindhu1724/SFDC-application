package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase22 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		leads();
		todayLeads();
		usernameDropDown();
		logout();
		loginToSalesForce();
		lead();
		goButton();
		
	}
	
	public static void todayLeads() throws Exception{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
      Select dropDown = new Select(driver.findElement(By.xpath("//select[@title='View:']")));
      dropDown.selectByVisibleText("Today's Leads");
	}
	
	public static void goButton() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@title='Go!']")));
		driver.findElement(By.xpath("//input[@title='Go!']")).click();
	}
	
	public static void lead() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Leads']")));
		driver.findElement(By.xpath("//a[normalize-space()='Leads']")).click();
		Thread.sleep(4000);
		
	}


}
