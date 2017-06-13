package com.pagefactory.utility;

//http://relevantcodes.com/Tools/ExtentReports2/javadoc/index.html?com/relevantcodes/extentreports/ExtentReports.html


import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		System.out.println("value of extenet" + " " + extent);
		if (extent == null) {
			System.out.println("value of extenet inside if" + " " + extent);
			Date d=new Date();
			String fileName=d.toString().replace(":", "_").replace(" ", "_")+".html";
			System.out.println(fileName);
			extent = new ExtentReports("D:\\java learning\\pagefactoryframework\\pagefactoryframework\\report"+fileName, true, DisplayOrder.NEWEST_FIRST);
			System.out.println(extent);
			
			//extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
			//D:\java learning\pagefactoryframework\pagefactoryframework\ReportsConfig.xml
			extent.loadConfig(new File("D:\\java learning\\pagefactoryframework\\pagefactoryframework\\ReportsConfig.xml"));
			System.out.println("after executing  loadconfig");
			// optional
			extent.addSystemInfo("Selenium Version", "2.53.0").addSystemInfo(
					"Environment", "QA");
			System.out.println("after adding system infor ");
			
		}
		System.out.println(extent);
		return extent;
	}
}
