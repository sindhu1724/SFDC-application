package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCase34 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		 home();
		 editProfile();
		 aboutFrame();
		 checkLastNameAfterEdit();

	}
	
	public static void checkLastNameAfterEdit() throws Exception{
		
		String sindhu = driver.findElement(By.id("tailBreadcrumbNode")).getText();
		System.out.println(sindhu);
		System.out.println("after updating lastname");
		String sindhuK = driver.findElement(By.id("userNavLabel")).getText();
		System.out.println(sindhuK);
	}

}
