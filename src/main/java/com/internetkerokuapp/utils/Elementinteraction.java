package com.internetkerokuapp.utils;

import org.openqa.selenium.WebElement;

public class Elementinteraction {
	
	//generic methods //1.click, 2.clear, 3.gettext
	public static void myclick(WebElement ele)
	{
		if(ele!=null)
		{
			//
			System.out.println("element clicked");
			ele.click();
		}
		
	}
	public static void myclear(WebElement ele)
	{
		if(ele!=null)
		{
			ele.clear();;
		}
		
	}
	
	
	
}
