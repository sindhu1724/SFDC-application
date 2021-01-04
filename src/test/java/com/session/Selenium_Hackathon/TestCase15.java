package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase15 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		oppurtunities();
		

	}
	
	public static void oppurtunities() throws Exception{
		
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")));
		driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//select[@id='fcf']")));
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
		
		}

}
