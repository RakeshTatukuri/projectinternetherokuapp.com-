package com.internerherokuapp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InternetHerokuapp.base.SetUp;
import com.internetkerokuapp.utils.Elementinteraction;

public class ABTestPage extends SetUp {

	//page object model
	/* 1.find the webelements-->@FindBy()//private(encapsulation)
	 * 2.Actions/methods----->click,clear//public
	 * 3.constructor ------>driver public
	 */
	
	/*Q1)encapsulation where we are using in project
	*we are following pom,in pom we have one page i.e ABTestPage in that page we are finding the webelements
	* those webelements are private
	*/
	
	//constructor
	public ABTestPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[normalize-space()='A/B Testing'])[1]")
	private  WebElement abtestlink;
	
	//methods
	 public  void clickonABTestlink()
	{
		//abtestlink.click();
		// note: here we are using generic method
		 Elementinteraction.myclick(abtestlink);//classname.methodname()
	}
	 
	 //header
	 @FindBy(xpath="//div[@class='example']//h3")
		private  WebElement header;

		 public String getheader()
		{
			return header.getText();	
		}
	//paragraph
		 @FindBy(xpath="//h3[text()='A/B Test Variation 1']/following-sibling::p")
		 private WebElement paragraph;
		 public String getparagraph()
		 {
			return paragraph.getText();	 
		 }
	//element selenium button
		 @FindBy(xpath="//a[text()='Elemental Selenium']")
		 private WebElement elementseleniumbtn;
		 public boolean seleniumbtnpres()
		 {
			return elementseleniumbtn.isDisplayed();
		 }
		
		 
		 
		 
}
