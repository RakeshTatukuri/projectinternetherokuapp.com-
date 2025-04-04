package com.InternetHerokuapp.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.InternetHerokuapp.base.SetUp;
import com.internerherokuapp.Pages.ABTestPage;

public class ABTest extends SetUp {

	//Test---@Test
	//constructor in setup will read the configuration value , once it reads the configuration value we are giving initialization value
	
	 ABTestPage abpage; 
	
	ABTest()   //constructor
	//note: when ever we execute the constructor it will write automatically  the super(); keyword
	{
		super(); //it will call parent class constructor eg: it read --->brower_value=chrome , url=internet
		initialization(); //opened the browser chrome ,url
		abpage=new ABTestPage(driver);
		//abpage.clickonABTestlink();
	}
	
	@Test
	public  void demotest1()
	{
	//1.create the object of same class
		//it will call constructor
		//will it call initialization: no
		
	abpage.clickonABTestlink();
	}
	
	@Test
	public void header()
	{
		//step1: verify that the header of A/B Test Control/Variation 1
				String act=abpage.getheader();
				act=act.substring(0,19);
				System.out.println("act------> "+act);
				Assert.assertEquals(act, "A/B Test Variation 1");	
				

	}
	@Test
	public void verifyparagraphstartswith()
	{
		//step2: verify that the paragraph on A/B Test page starts with "Also known as split testing"
		String exp="Also known as split testing";
		String actu=abpage.getparagraph();
		boolean b=actu.startsWith(exp);
		Assert.assertTrue(b);
		
	}
	@Test
	public void verifyparagraphendswith()
	{
		//step3: verify that the paragraph on ABTest page ends with "(e.g. a user action such as a click-through)."
		String exp="(e.g. a user action such as a click-through).";	
		String act=abpage.getparagraph();
		boolean b=act.endsWith(exp);
		Assert.assertTrue(b);
	}
	@Test
	public void verifyelementseleniumbuttonispresent()
	{
		//step4: verify that the abtest page has "Elemental Selenium"
		boolean b=abpage.seleniumbtnpres();
		Assert.assertTrue(b);
		
	}
	
	
	
	
	
}
