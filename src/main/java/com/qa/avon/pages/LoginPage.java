package com.qa.avon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   WebDriver driver;
   @FindBy(how=How.XPATH, using="//a[text()='Sign In']")
   WebElement linkSignIn;
   
   @FindBy(how=How.XPATH, using="//input[@name='LoginModel_Email']")
   WebElement textboxUserName;
   
   @FindBy(how=How.XPATH, using="//input[@name='LoginModel_Password']")
   WebElement textboxPwd;
   
   @FindBy(how=How.XPATH,using="//a[@data-ng-click='Login()']")
   WebElement buttonLogin;
   
   public LoginPage(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   //--------------------------
   public void clickOnSignIn()
   {
	   linkSignIn.click();
   }
   public void setUserName(String username){
	   
	   textboxUserName.sendKeys(username);
   }
   public void setPassWord(String password){
	   
	   textboxPwd.sendKeys(password);
   }
   public void clickLoginbutton() {
	   
	   buttonLogin.click();
   }
   
}
