package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase5 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		usernameDropDown();
		usernameDropDownMouseHover();

	}
	
	public static void usernameDropDownMouseHover() throws Exception {
		
		//mousehovering myprofile 
		waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='My Profile']")));
	    WebElement myProfile = driver.findElement(By.xpath("//a[normalize-space()='My Profile']"));
	    Actions action = new Actions(driver);
		action.moveToElement(myProfile).build().perform();
		//mousehovering mysettings
		waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='My Settings']")));
	    WebElement mySetting = driver.findElement(By.xpath("//a[normalize-space()='My Settings']"));
	    Actions action1 = new Actions(driver);
		action1.moveToElement(mySetting).build().perform();
		
		waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='Developer Console']")));
	    WebElement devConsole = driver.findElement(By.xpath("//a[normalize-space()='Developer Console']"));
	    Actions action2 = new Actions(driver);
		action2.moveToElement(devConsole).build().perform();
		
		waitExplicitly(10,driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']")));
	    WebElement lightExp = driver.findElement(By.xpath("//a[@title='Switch to Lightning Experience']"));
	    Actions action3 = new Actions(driver);
		action3.moveToElement(lightExp).build().perform();
		
		waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='Logout']")));
	    WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
	    Actions action4 = new Actions(driver);
		action4.moveToElement(logout).build().perform();
		
		System.out.println("test case passed: drop down appeared with My profile & settings & console & Lightning Experience & logout");
		
	}

}
