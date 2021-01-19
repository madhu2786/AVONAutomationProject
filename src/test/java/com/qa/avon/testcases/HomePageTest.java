package com.qa.avon.testcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.avon.base.BaseClass;
import com.qa.avon.pages.HomePage;
import com.qa.avon.pages.LoginPage;

public class HomePageTest 
{
	@Test(enabled=false)
	public void verifyHomePageTitle()
	{
		BaseClass baseclass=new BaseClass();
		Properties prop=baseclass.loadProperties();
		WebDriver driver=baseclass.startBrowser(prop.getProperty("browsername"));
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickOnSignIn();
		loginpage.setUserName(prop.getProperty("username"));
		loginpage.setPassWord(prop.getProperty("password"));
		loginpage.clickLoginbutton();
		
		HomePage homepage=new HomePage(driver);
		homepage.verifyHomepageTitle();
	}
	@Test
	public void verifyProductRecallsLink()
	{
		BaseClass baseclass=new BaseClass();
		Properties prop=baseclass.loadProperties();
		WebDriver driver=baseclass.startBrowser(prop.getProperty("browsername"));
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.clickOnSignIn();
		loginpage.setUserName(prop.getProperty("username"));
		loginpage.setPassWord(prop.getProperty("password"));
		loginpage.clickLoginbutton();
		
		HomePage homepage=new HomePage(driver);
		homepage.verifyHomepageTitle();
		homepage.verifylinkProductRecalls();
	}

}
