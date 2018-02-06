package com.aia.join.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aia.join.aia.base.TestBase;


public class LoginPage extends TestBase{
	
	@FindBy(id="capture_signIn_signInEmailAddress")
	WebElement userName;
	
	@FindBy(id="capture_signIn_currentPassword")
	WebElement password;
	
	@FindBy(xpath="//a[text()='Sign in.']")
	WebElement signinbtn;
	
	@FindBy(xpath="//*[@id='capture_signIn_signInForm']//input[@value='Sign in']")
	WebElement loginBtn;
	
	
	
	
	public LoginPage(){		
		PageFactory.initElements(driver, this);		
	}
	
	public void openLoginPopup(){	
		try{
		Thread.sleep(2000);
		}catch(Exception e)
		{
			
		}	
		signinbtn.click();		
	}
	
	
	//Actions
	
	public String validateLoginPageTitle(){		
		return driver.getTitle();
		
	}	
	
	
	
	public String login(String un, String pwd){	
		openLoginPopup();
		userName.sendKeys(un);		
		password.sendKeys(pwd);	
		loginBtn.click();		
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);		
		//System.out.println("xxxx  "+driver.getTitle());
		return new SelectmemberTypePage().getPageHeading();
		
		
	}

}
