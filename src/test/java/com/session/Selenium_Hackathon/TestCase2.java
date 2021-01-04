package com.session.Selenium_Hackathon;

public class TestCase2 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		System.out.println("Test case 2 passed ");

	}

}
