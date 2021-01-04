package com.session.Selenium_Hackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TestCase25 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		newContact();

	}
	
	
	
	public static void newContact() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@title='New']")));
		driver.findElement(By.xpath("//input[@title='New']")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).clear();
		driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
		waitExplicitly(20,driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")));
		driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
		Thread.sleep(3000);
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windows.get(1));
		driver.switchTo().frame("resultsFrame");
		waitExplicitly(30,driver.findElement(By.xpath("//a[normalize-space()='GlobalMedia']")));
		driver.findElement(By.xpath("//a[normalize-space()='GlobalMedia']")).click();
		
		driver.switchTo().window(windows.get(0));
		waitExplicitly(30,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		
		
	}

}
