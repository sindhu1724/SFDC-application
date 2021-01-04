package com.session.Selenium_Hackathon;

public class TestCase23 extends HackathonUtility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		gotoSalesForce();
		loginToSalesForce();
		leads();
		todayLeads();

	}

}
