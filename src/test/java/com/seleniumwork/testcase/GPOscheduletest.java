package com.seleniumwork.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumwork.page.GPO.HPEFSHome;
import com.seleniumwork.page.GPO.LoginGPO;
import com.seleniumwork.page.GPO.Phoenix;
import com.seleniumwork.page.GPO.Schedules;
import com.seleniumwork.util.DriverFactory;

public class GPOscheduletest {

	@Test
	public void createSchedule() throws InterruptedException{
		
		WebDriver driver = DriverFactory.getIEDriver();
	    driver.get("http://g1w6334g.austin.hpecorp.net/portal/server.pt?open=space&name=Login&control=Login&doLogout=&clearsession=true&in_hi_userid=10418&cached=true");//????,??????????? page ??
	    driver.manage().window().maximize();
	    LoginGPO lg=new LoginGPO("\\page-locator-repository.xml",driver,"/login.xls");
		lg.loginGPO();
		HPEFSHome hpefsHome=new HPEFSHome("\\page-locator-repository.xml", driver, null);
		hpefsHome.goToPhoenix();
		Phoenix Phoenix = new Phoenix("\\page-locator-repository.xml", driver, "/input.xls");
		Phoenix.goToSchedules();
		Phoenix.customerSelectionByID();
		Phoenix.schedulesCustomerSearch();
		Phoenix.selectBowdoinCollege();

		Schedules Schedules = new Schedules("\\page-locator-repository.xml", driver,"/schedules.xls");
		Schedules.schedulesAddNew();
		Schedules.schedulesInvDestRule();
		Schedules.schedulesHPFSLegalEntity();
		Schedules.schedulesReceiveInCCY();
		Schedules.schedulesBusinessSubSegement();
		Schedules.schedulesTerm();
		Schedules.schedulesSchdeuleType();
		Schedules.schedulesRegion();
		Schedules.schedulesProcessSegment();
		Schedules.schedulesFrequency();
		Schedules.schedulesAdvance();
		Schedules.schedulesTermsAndConditions();
		Schedules.schedulesBillingAddress();
		Schedules.schedulesOpportunity();
		Schedules.schedulesBillingMethod();
		Schedules.schedulesInvoiceFormat();
		Schedules.schedulesUPMTermLevel();
		Schedules.schedulesDetailsBtSave();
		

	}
	
}
