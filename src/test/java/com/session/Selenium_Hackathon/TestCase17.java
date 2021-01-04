package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase17 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		pipelineOppurtunity();
		

	}
	
	public static void pipelineOppurtunity() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")));
		driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Opportunity Pipeline']")));
		driver.findElement(By.xpath("//a[normalize-space()='Opportunity Pipeline']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//h1[normalize-space()='Opportunity Pipeline']")));
		
		
		
	}

}
