package com.session.Selenium_Hackathon;

import org.openqa.selenium.By;

public class TestCAse11 extends HackathonUtility{

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		accounts();
		accountNewView();
		
		

	}

}
