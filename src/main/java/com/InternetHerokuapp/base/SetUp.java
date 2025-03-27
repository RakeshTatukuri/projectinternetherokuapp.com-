package com.InternetHerokuapp.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.InternetHerokuapp.waits.Waits;

public class SetUp {

	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String browser;
	public static String url;
	public static WebDriver driver;
	
	public SetUp()//constructor
	{
		file =new File("./Config/config.properties");
		try {
			fis =new FileInputStream(file);
			prop=new Properties();
			
				prop.load(fis);
			 
		    } 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		browser=prop.getProperty("browser");//key
		url=prop.getProperty("url");
	}
	
	//logic : to take decision which browser we want to open
	public void initialization()
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("browser not found");
			return;
		}
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Waits.PAGE_LOAD_TIMEOUT));
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		SetUp obj=new SetUp();
		obj.initialization();
	}
}
