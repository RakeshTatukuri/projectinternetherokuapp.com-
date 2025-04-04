package com.internerherokuapp.listeners;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.InternetHerokuapp.base.SetUp;

//generic methods to take screen shots 
public class MyListener extends SetUp implements ITestListener{

	//itestlistener
	//to take screen shot for failed test cases
	//if test is passed you will test passed name(test)
	//note: itestlistener has 8 methods ( click on source and click on override and select the method)
	
   public void onTestFailure(ITestResult result) {
	
	   takescreenshot() ;
	}
public void takescreenshot() {
	
	//generate some random name,append time
		LocalTime obj=LocalTime.now();
		System.out.println(obj);
		String str=obj.toString().replace(":", "").replace(".", "").substring(9);
	/*	String str=obj.toString();
		String str1=str.replace(";", "");
		String str2=str1.replace(".", "");
		String str3=str2.substring(9);
	*/	
	TakesScreenshot tk=(TakesScreenshot)driver;
	File screenshot=tk.getScreenshotAs(OutputType.FILE);
	
	
		try {
			FileUtils.copyFile(screenshot, new File("./myscreenshot/scr"+str+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	
}
