package com.session.Selenium_Hackathon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestCase21 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		leads();
		dropDownLeadsView();

	}
	
	public static void dropDownLeadsView() throws Exception{
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='fcf']")).click();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='fcf']"));
		Actions al = new Actions(driver);
		al.moveToElement(dropDown).build().perform();
		
	}

}
