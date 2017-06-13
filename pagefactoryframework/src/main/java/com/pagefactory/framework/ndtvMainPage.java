package com.pagefactory.framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pagefactory.utility.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ndtvMainPage extends BaseClass{

	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test = rep.startTest("ndtvMainPage");

	
	@Test()
	public void TestMainPage(){
			
		//Lauch the browser and Launch Application
		BaseClass bc = new BaseClass();
		test.log(LogStatus.INFO, "initiating OpenBrowser");		
		bc.OpenBrowser();
		bc.OpenURL();
		
		
			
	}
	
	
	@AfterTest()
	public void EndTest(){
		
		rep.endTest(test);
		rep.flush();
	} 

		
	}
	
	

