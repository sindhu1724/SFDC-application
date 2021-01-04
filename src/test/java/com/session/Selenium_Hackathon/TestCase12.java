package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase12 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		accounts();
		accountEditView();
		

	}
	public static void accountEditView() throws Exception{
		Thread.sleep(5000);
		//waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Edit']")));
		driver.findElement(By.linkText("Edit")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("selenium_newview");
		driver.findElement(By.xpath("//input[@id='devname']")).clear();
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("selenium_newview");
		
		Select field = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
		field.selectByVisibleText("Account Name");
		
		Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
		operator.selectByVisibleText("contains");
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='fval1']")));
		driver.findElement(By.xpath("//input[@id='fval1']")).clear();
		driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("<a>");
		
		Select fields = new Select(driver.findElement(By.xpath("//label[normalize-space()='Available Fields']")));
		fields.selectByVisibleText("Last Activity");
		
		driver.findElement(By.xpath("(//img[@alt='Add'])[1]")).click();
		
		waitExplicitly(20,driver.findElement(By.xpath("(//input[@name='save'])[3]")));
		driver.findElement(By.xpath("(//input[@name='save'])[3]")).click();
		
	}
	
	

}
