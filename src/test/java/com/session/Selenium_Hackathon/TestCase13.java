package com.session.Selenium_Hackathon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class TestCase13 extends HackathonUtility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		accounts();
		mergeAccounts();

	}
	
	public static void mergeAccounts() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Merge Accounts']")));
		driver.findElement(By.xpath("//a[normalize-space()='Merge Accounts']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='srch']")));
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Automation");
		waitExplicitly(20,driver.findElement(By.xpath("//input[@value='Find Accounts']")));
		driver.findElement(By.xpath("//input[@value='Find Accounts']")).click();
		driver.findElement(By.xpath("//input[@id='cid0']")).click();
		driver.findElement(By.xpath("//input[@id='cid1']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Next']")));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Next']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("(//input[@value=\" Merge \"])[2]")));
		driver.findElement(By.xpath("(//input[@value=\" Merge \"])[2]")).click();
		
		Alert al = driver.switchTo().alert();
		al.accept();
	}
}
