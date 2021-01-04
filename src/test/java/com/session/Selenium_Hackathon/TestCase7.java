package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase7 extends HackathonUtility  {

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		usernameDropDown();
		 mySettings();
		// mySettingsLoginHistory();
		// displayAndLayout();
		// email();
		 calenderAndReminders();
		 
		}
	
	public static void calenderAndReminders() throws Exception{
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href=\"javascript:HTMLTreeNode.prototype.toggleHTMLTree('CalendarAndReminders');\"]")).click();
		waitExplicitly(30,driver.findElement(By.xpath("//span[@id='Reminders_font']")));
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		waitExplicitly(30,driver.findElement(By.id("testbtn")));
		driver.findElement(By.id("testbtn")).click();
		
		System.out.println("pop up window opened");
	}

}
