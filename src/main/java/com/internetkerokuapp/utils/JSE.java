package com.internetkerokuapp.utils;

import org.openqa.selenium.JavascriptExecutor;

import com.InternetHerokuapp.base.SetUp;

public class JSE extends SetUp {

	//scroll a page till x unit
	public static void scrollpageVertically(int y)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,"+y+");");
		
	}
	public static void scrollpageHorizontally(int x)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+",0);");
		
	}
}
