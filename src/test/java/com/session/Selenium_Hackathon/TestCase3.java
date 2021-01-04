package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase3 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		checkRemeberMeBox();
		usernameDropDown();
		System.out.println("TestCase4 passed: username dropdown displayed on the home page");
		logout();
		
	}
	
	public static void checkRemeberMeBox() throws Exception {
		
		
		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,userName);
		userName.clear();
		userName.sendKeys("spk@spk.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("Sindhuchowdary123");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		checkBox.click();
		
		// Check whether the Check box is toggled on 		
        if (checkBox.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        
        
		
	}

}
