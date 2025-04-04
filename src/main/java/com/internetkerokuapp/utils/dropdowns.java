package com.internetkerokuapp.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	//generic method dropdowns
	
	public static Select sel;
	public static void selectbytext(WebElement ele,String text)
	{
		sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	public static void selectbyindex(WebElement ele,int index)
	{
		sel=new Select(ele);
		sel.selectByIndex(index);
	}
	public static void selectbyvalue(WebElement ele,String value)
	{
		sel=new Select(ele);
		sel.selectByValue(value);
	}
	
}
