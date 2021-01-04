package com.session.Selenium_Hackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestCase36 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		home1();
		blockingEventCalender();
		

	}
  
	public static void blockingEventCalender() throws Exception{
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Sunday January 3, 2021']")));
		driver.findElement(By.xpath("//a[normalize-space()='Sunday January 3, 2021']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='8:00 PM']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='8:00 PM']")));
		driver.findElement(By.xpath("//a[normalize-space()='8:00 PM']")).click();

        driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']")).click();
        ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(window.get(1));
        waitExplicitly(20,driver.findElement(By.xpath("//li[@class='listItem4']//a[1]")));
        driver.findElement(By.xpath("//li[@class='listItem4']//a[1]")).click();
        
        driver.switchTo().window(window.get(0));
        driver.findElement(By.cssSelector("input#EndDateTime_time")).clear();
        driver.findElement(By.cssSelector("input#EndDateTime_time")).sendKeys("11:30 PM");
        
        WebElement element = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", element);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		
	}
}
