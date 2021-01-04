package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase29 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		viewContactinContactPage();

	}
	
	public static void viewContactinContactPage() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.id("fcf")));
		Select view = new Select(driver.findElement(By.id("fcf"))); 
		view.selectByIndex(7);
		waitExplicitly(20,driver.findElement(By.xpath("//a[contains(text(),'technical')]")));
		driver.findElement(By.xpath("//a[contains(text(),'technical')]")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[@id='0034x000001e0PZ_RelatedOpportunityList_link']")));
		System.out.println("page displayed ");
	}

}
