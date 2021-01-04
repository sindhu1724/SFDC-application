package com.session.Selenium_Hackathon;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase14 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		accounts();
		accountReport();
		

	}
	 public static void accountReport() throws Exception{
		 
		 waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Accounts with last activity > 30 days']")));
		 driver.findElement(By.xpath("//a[normalize-space()='Accounts with last activity > 30 days']")).click();
		// waitExplicitly(20,driver.findElement(By.xpath("//button[normalize-space()='No Thanks']")));
		// driver.findElement(By.xpath("//button[normalize-space()='No Thanks']")).click();
		 
		 //waitExplicitly(20,driver.findElement(By.xpath("//input[@id='ext-gen20']")));
		 
		 waitExplicitly(20,driver.findElement(By.xpath("//input[@id='ext-comp-1042']")));
		 WebElement dateBoxFrom = driver.findElement(By.xpath("//input[@id='ext-comp-1042']"));
		 dateBoxFrom.sendKeys("1/3/2021");
		 Thread.sleep(4000);
		  
		 WebElement dateBoxTo = driver.findElement(By.xpath("//input[@id='ext-comp-1045']"));
				 dateBoxTo.clear();
				 dateBoxTo.sendKeys("1/3/2021");
				 Thread.sleep(4000);
				 
				 java.util.List<WebElement> field = driver.findElements(By.xpath("//img[@id='ext-gen148']"));
				 field.get(1);
				 
	 
				 
		 
		 waitExplicitly(20,driver.findElement(By.xpath("//button[normalize-space()='Save']")));
		 //driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		 waitExplicitly(20, driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		 driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("activityreport");
		 driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).click();
		 waitExplicitly(20,driver.findElement(By.xpath("//button[normalize-space()='Save and Run Report']")));
		 driver.findElement(By.xpath("//button[normalize-space()='Save and Run Report']")).click();
		 
		 
		 
	 }

}
