package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase27 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		recentlyCreatedContact();
		

	}
	
	public static void recentlyCreatedContact() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.id("hotlist_mode")));
		Select dropDown = new Select(driver.findElement(By.id("hotlist_mode")));
		dropDown.selectByIndex(0);
		
	}

}
