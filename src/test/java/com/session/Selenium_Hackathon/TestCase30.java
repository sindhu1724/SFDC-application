package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase30 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		contacts();
		checkErrorInNewViewPage();

	}
	
	public static void checkErrorInNewViewPage() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//span[@class='fFooter']//a[1]")));
		driver.findElement(By.xpath("//span[@class='fFooter']//a[1]")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).clear();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFDH");
		
		waitExplicitly(20,driver.findElement(By.xpath("(//input[@name='save'])[2]")));
		driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//div[@class='errorMsg']")));
		String errorYouMust = driver.findElement(By.xpath("//div[@class='errorMsg']")).getText();
		System.out.println(errorYouMust);
	}

}
