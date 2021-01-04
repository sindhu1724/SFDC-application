package com.session.Selenium_Hackathon;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCase16 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		newoppurtunitie();
		
	}
	
	public static void newoppurtunitie() throws Exception{
		
		waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")));
		driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//input[@title='New']")));
		driver.findElement(By.xpath("//input[@title='New']")).click();
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='opp3']")));
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("NewOppurtunity");
		waitExplicitly(20,driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")));
		driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']")).click();
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		driver.switchTo().frame("resultsFrame");
		Thread.sleep(4000);
		driver.findElement(By.xpath(" //a[normalize-space()='Automation']")).click();
		driver.switchTo().window(windows.get(0));
		waitExplicitly(20,driver.findElement(By.xpath("//select[@id='opp6']")));
		Select leadSource = new Select(driver.findElement(By.xpath("//select[@id='opp6']")));
		leadSource.selectByIndex(2);
		
		waitExplicitly(20,driver.findElement(By.xpath("//input[@id='opp9']")));
		WebElement closeDate = driver.findElement(By.xpath("//input[@id='opp9']"));
		closeDate.sendKeys("1/3/2021");
		waitExplicitly(20,driver.findElement(By.xpath("//select[@id='opp11']")));
		Select stage = new Select(driver.findElement(By.xpath("//select[@id='opp11']")));
		stage.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='opp12']")).clear();
		driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("20");
		waitExplicitly(20,driver.findElement(By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']")));
		driver.findElement(By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']")).click();
		Thread.sleep(4000);
		ArrayList<String> window = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window.get(1));
		Thread.sleep(4000);
		driver.switchTo().frame("resultsFrame");
		waitExplicitly(20,driver.findElement(By.xpath(" //a[normalize-space()='selenium']")));
		driver.findElement(By.xpath(" //a[normalize-space()='selenium']")).click();
		driver.switchTo().window(windows.get(0));
		waitExplicitly(20,driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")));
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		
		
		
	}

}
