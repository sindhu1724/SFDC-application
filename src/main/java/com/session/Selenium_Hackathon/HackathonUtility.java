package com.session.Selenium_Hackathon;

import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HackathonUtility {
	

public static WebDriver driver;
	
	public static void launchBrowser() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	
	public static void gotoSalesForce() throws Exception {
		driver.get("https://login.salesforce.com/");
		waitExplicitly(5,driver.findElement(By.id("logo")));
		
	}
	
public static void myProfile() throws Exception{
		
		waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='My Profile']")));
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();

}

public static void editProfile() throws Exception{
	
	Thread.sleep(5000);
	waitExplicitly(20,driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")));
	driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")).click();
	Thread.sleep(5000);

}
	
	public static void waitExplicitly(int iSeconds,WebElement ele) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,iSeconds);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
public static void aboutFrame() throws Exception{
		
		driver.switchTo().frame("contactInfoContentId");
		waitExplicitly(10,driver.findElement(By.linkText("About")));
		driver.findElement(By.linkText("About")).click();
		waitExplicitly(10,driver.findElement(By.xpath("//input[@id='lastName']")));
		driver.findElement(By.xpath("//input[@id='lastName']")).clear();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Abcd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		System.out.println("last name changed");
		}

public static void postComment() throws Exception{
	
	Thread.sleep(5000);
	//waitExplicitly(30,driver.findElement(By.xpath("//span[text()='Post']")));
	driver.findElement(By.xpath("//span[text()='Post']")).click();
	waitExplicitly(30,driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']")));
	//Thread.sleep(6000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']")));
	Thread.sleep(4000);
	WebElement sendPost = driver.findElement(By.xpath("//body[@spellcheck='true']"));
	sendPost.sendKeys("This is Automation testing");
	driver.switchTo().defaultContent();
	waitExplicitly(30,driver.findElement(By.xpath("//input[@title='Share']")));
	driver.findElement(By.xpath("//input[@title='Share']")).click();
	System.out.println("Successfully shared post");
}

public static void fileUpload() throws Exception{
	Thread.sleep(5000);
	//waitExplicitly(30,driver.findElement(By.xpath("//span[normalize-space()='File']")));
	driver.findElement(By.xpath("//span[normalize-space()='File']")).click();
	waitExplicitly(30,driver.findElement(By.xpath("//a[normalize-space()='Upload a file from your computer']")));
	driver.findElement(By.xpath("//a[normalize-space()='Upload a file from your computer']")).click();
	waitExplicitly(30,driver.findElement(By.xpath("//input[@id='chatterFile']")));
	WebElement chooseFile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
	chooseFile.sendKeys("C:\\Users\\sindh\\Downloads\\Automation.jpg");
	waitExplicitly(30,driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
	driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
	System.out.println("Successfully uploaded image");
}

public static void profileImageUpload() throws Exception{
	
    Thread.sleep(5000);
	WebElement mouseHover = driver.findElement(By.xpath("//img[@title='Sindhu Kalyanam']"));
	Actions action = new Actions(driver);
	action.moveToElement(mouseHover).build().perform();
	waitExplicitly(30,driver.findElement(By.xpath("//a[normalize-space()='Add Photo']")));
	driver.findElement(By.xpath("//a[normalize-space()='Add Photo']")).click();
	driver.switchTo().frame("uploadPhotoContentId");
	System.out.println("entered to frame1");
	waitExplicitly(30,driver.findElement(By.xpath("//input[@type='file']")));
	WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
	
	chooseFile.sendKeys("C:\\Users\\sindh\\Downloads\\Automation.jpg");
	waitExplicitly(30,driver.findElement(By.xpath("(//input[@value='Save'])[2]")));
	driver.findElement(By.xpath("(//input[@value='Save'])[2]")).click();
	
	WebElement imageCrop = driver.findElement(By.xpath("//div[@class='imgCrop_selArea']/following-sibling::div[1]"));
	Actions crop = new Actions(driver);
	crop.clickAndHold(imageCrop).moveByOffset(30,50).release().build().perform();
	//waitExplicitly(30,driver.findElement(By.xpath("//input[@value='Save']")));
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	driver.switchTo().defaultContent();
	System.out.println("Exited from iframe");
	
}
	
    public static void loginToSalesForce() throws Exception {
    	
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
		waitExplicitly(5,userName);
		userName.clear();
		userName.sendKeys("spk@spk.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.clear();
		password.sendKeys("Sindhuchowdary123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		}
    
public static void usernameDropDown() throws Exception{
		
		waitExplicitly(5,driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	
	}

public static void mySettings() throws Exception {
	
	waitExplicitly(30,driver.findElement(By.linkText("My Settings")));
	driver.findElement(By.linkText("My Settings")).click();
	
}

public static void mySettingsLoginHistory() throws Exception {
	Thread.sleep(6000);
	//waitExplicitly(20,driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")));
	driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
	waitExplicitly(20,driver.findElement(By.xpath("//span[@id='LoginHistory_font']")));
	driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
	driver.findElement(By.xpath("//div[@class='pShowMore']//a[1]")).click();
	System.out.println("Login history is displayed and downloaded");
}

public static void displayAndLayout() throws Exception{
	Thread.sleep(5000);
	//waitExplicitly(20,driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")));
	driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
	waitExplicitly(20,driver.findElement(By.xpath("//span[text()='Customize My Tabs']")));
	driver.findElement(By.xpath("//span[text()='Customize My Tabs']")).click();
	WebElement p = driver.findElement(By.id("p4")); 
	new Select(p).selectByVisibleText("Salesforce Chatter");
	waitExplicitly(20,driver.findElement(By.xpath("//option[@value='report']")));
	driver.findElement(By.xpath("//option[@value='report']")).click();
	driver.findElement(By.className("rightArrowIcon")).click();
	driver.findElement(By.name("save")).click();
	System.out.println("Reports field added to selected tab list ");
}

public static void email() throws Exception{
	Thread.sleep(5000);
	//waitExplicitly(20,driver.findElement(By.xpath("//span[@id='EmailSetup_font']")));
	driver.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
	driver.findElement(By.xpath("//span[text()='My Email Settings']")).click();
	driver.findElement(By.id("sender_name")).clear();
	driver.findElement(By.id("sender_name")).sendKeys("Sindhu");
	driver.findElement(By.id("sender_email")).clear();
	driver.findElement(By.id("sender_email")).sendKeys("sindhu.kalyanam@gmail.com");
	driver.findElement(By.id("auto_bcc1")).click();
	driver.findElement(By.name("save")).click();
	System.out.println("Given details are added as default mail option");
}

public static void accounts() throws Exception{
	
	waitExplicitly(30,driver.findElement(By.xpath("//a[@title='Accounts Tab']")));
	driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
	
}

public static void accountsNew() throws Exception{
  
          waitExplicitly(20,driver.findElement(By.xpath("//input[@title='New']")));
	      driver.findElement(By.xpath("//input[@title='New']")).click();
	      
	      waitExplicitly(20,driver.findElement(By.xpath("//input[@id='acc2']")));
	      driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("GlobalMedia");
	      Select type = new Select(driver.findElement(By.xpath("//select[@id='acc6']")));
	      type.selectByVisibleText("Technology Partner");
	      waitExplicitly(20,(driver.findElement(By.xpath("//select[@id='00N4x00000DVbfD']"))));
	      Select priority = new Select(driver.findElement(By.xpath("//select[@id='00N4x00000DVbfD']")));
	      priority.selectByIndex(1);
	      driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
}

public static void accountNewView() throws Exception{
	
	
	waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Create New View']")));
	driver.findElement(By.xpath("//a[normalize-space()='Create New View']")).click();
	waitExplicitly(20,driver.findElement(By.xpath("//input[@id='fname']")));
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("selenium view");
	waitExplicitly(20,driver.findElement(By.xpath("//input[@id='devname']")));
	driver.findElement(By.xpath("//input[@id='devname']")).click();
	waitExplicitly(20,driver.findElement(By.xpath("(//input[@name='save'])[2]")));
	driver.findElement(By.xpath("(//input[@name='save'])[2]")).click();
}

public static void Oppurtunities() throws Exception{
	
	waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")));
	driver.findElement(By.xpath("//a[normalize-space()='Opportunities']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
}

public static void leads() throws Exception{
	
	waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Leads']")));
	driver.findElement(By.xpath("//a[normalize-space()='Leads']")).click();
	Thread.sleep(4000);
	//waitExplicitly(20,driver.findElement(By.xpath("//a[@class='dialogClose']")));
	driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
}

public static void todayLeads() throws Exception{
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//select[@id='fcf']")).click();
  Select dropDown = new Select(driver.findElement(By.xpath("//select[@title='View:']")));
  dropDown.selectByVisibleText("Today's Leads");
}

public static void contacts() throws Exception{
	
	waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Contacts']")));
	driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
	Thread.sleep(4000);
	//waitExplicitly(20,driver.findElement(By.xpath("//a[@class='dialogClose']")));
	driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
	
	}

public static void home() throws Exception{
	waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Home']")));
	driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	Thread.sleep(4000);
	//waitExplicitly(20,driver.findElement(By.xpath("//a[@class='dialogClose']")));
	driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
	waitExplicitly(20,driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[1]")));
	driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[1]")).click();
	
	waitExplicitly(20,driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")));
}

public static void home1() throws Exception{
	waitExplicitly(20,driver.findElement(By.xpath("//a[normalize-space()='Home']")));
	driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	Thread.sleep(4000);
	//waitExplicitly(20,driver.findElement(By.xpath("//a[@class='dialogClose']")));
	driver.findElement(By.xpath("//a[@class='dialogClose']")).click();
}

    
    public static void logout() throws Exception{
    	
        waitExplicitly(10,driver.findElement(By.xpath("//a[normalize-space()='Logout']")));
    	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
    	
    }

}
