package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase18 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		stuckOppurtunities();
		

	}
	
	public static void stuckOppurtunities() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")));
		driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Stuck Opportunities']")));
		driver.findElement(By.xpath("//a[normalize-space()='Stuck Opportunities']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//h1[normalize-space()='Stuck Opportunities']")));
		driver.findElement(By.xpath("//h1[normalize-space()='Stuck Opportunities']"));
		System.out.println("page displayed");
	}

}
