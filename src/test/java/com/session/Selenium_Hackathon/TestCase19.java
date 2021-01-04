package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase19 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		Oppurtunities();
		quaterlySummary();

	}
	
	public static void quaterlySummary() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//select[@id='quarter_q']")));
		Select interval = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
		interval.selectByIndex(3);
		waitExplicitly(20,driver.findElement(By.xpath("//select[@id='open']")));
		Select include = new Select(driver.findElement(By.xpath("//select[@id='open']")));
		include.selectByIndex(1);
		waitExplicitly(20,driver.findElement(By.xpath("//input[@title='Run Report']")));
		driver.findElement(By.xpath("//input[@title='Run Report']")).click();
		System.out.println("page displayed with details");
		
		
	}

}
