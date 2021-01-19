package com.qa.avon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseClass
{
   public WebDriver driver;
   public Properties prop;
   public Properties loadProperties()
   {
	   prop=new Properties();
	   try {
		FileInputStream fis=new FileInputStream("D:\\MadhuriWorkSpace\\AVONAutomationProject\\src\\main\\"
				+ "java\\com\\qa\\avon\\config\\config.properties");
		prop.load(fis);
		} 
	    catch (FileNotFoundException e)
	    {
			e.printStackTrace();
		}
	    catch (Exception e)
	    {
		 System.out.println("Please enter the correct path of config file");
	    }
	return prop;
   }
   @Test
   public WebDriver startBrowser(String browserName)
   {
	   
	   switch(browserName)
	   {
	       case "chrome":
		        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSoftware\\Drivers\\chromedriver.exe");
		        driver=new ChromeDriver();
		        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		        driver.manage().deleteAllCookies();
		        driver.manage().window().maximize();
		        driver.get(prop.getProperty("url"));
		        break;
	       case "firefox":
	    	    System.setProperty("webdriver.gecko.driver", "D:\\SeleniumSoftware\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		        driver=new FirefoxDriver();
		        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		        driver.manage().deleteAllCookies();
		        driver.manage().window().maximize();
		        driver.get(prop.getProperty("url"));
		        break;
		   default:
			   System.out.println("Please select the correct browserName");
	   }
	return driver;
   }
}