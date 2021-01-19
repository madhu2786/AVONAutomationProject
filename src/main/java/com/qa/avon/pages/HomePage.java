package com.qa.avon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage
{
	   WebDriver driver;
	   
	   @FindBy(how=How.XPATH, using="//span[text()='Product Recalls']")
	   WebElement linkproductrecall;
       
	   public HomePage(WebDriver driver){
	   this.driver=driver;	   
	   }
//----------------------------------------------
	   public void verifyHomepageTitle() {
	   String expectedtitle="AVON - Shop Cosmetics, Fashion & Accessories";
	   Assert.assertEquals(driver.getTitle(),expectedtitle);
       }
//----------------------------------------------	   
	   public void verifylinkProductRecalls() {
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	   linkproductrecall.click();
	   }
   
}
