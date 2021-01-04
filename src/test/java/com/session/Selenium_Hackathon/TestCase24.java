package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase24 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		leads();
		newLead();

	}
	
	public static void newLead() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@title='New']")));
		driver.findElement(By.xpath("//input[@title='New']")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).clear();
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='lea3']")));
		driver.findElement(By.xpath("//input[@id='lea3']")).clear();
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		
		
		waitExplicitly(20,driver.findElement(By.xpath("//select[@tabindex='15']")));
		WebElement leadStatus = driver.findElement(By.xpath("//select[@tabindex='15']"));
		Select se = new Select(leadStatus);
		se.selectByIndex(1);
		
		waitExplicitly(20,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		
		
		
	}

}
