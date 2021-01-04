package com.session.Selenium_Hackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TestCase8 extends HackathonUtility  {

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		usernameDropDown();
		developerConsole();
		
		}
	
	public static void developerConsole() throws Exception{
		
		waitExplicitly(30,driver.findElement(By.xpath("//a[normalize-space()='Developer Console']")));
		driver.findElement(By.xpath("//a[normalize-space()='Developer Console']")).click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		driver.close();
		System.out.println("developer console window closed");
	}
	
	

}
