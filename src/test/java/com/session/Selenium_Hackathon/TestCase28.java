package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase28 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		myContactFromDropDown();

	}
	
	public static void myContactFromDropDown() throws Exception{
		
		Select dropDown = new Select(driver.findElement(By.id("fcf")));
		dropDown.selectByIndex(3);
	}

}
