package com.pagefactory.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pagefactory.utility.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;






public class BaseClass {
	WebDriver driver=null;
	
	
	
	public void OpenBrowser(){
		
		//Test on Chrome browser
		
	
		System.setProperty("webdriver.chrome.driver","D:\\java learning\\selnium2.53.1\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public void OpenURL(){
		
		driver.get("http://www.ndtv.com/");
				
	}

}
