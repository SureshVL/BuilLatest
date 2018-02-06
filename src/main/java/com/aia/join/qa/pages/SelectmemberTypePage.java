package com.aia.join.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aia.join.aia.base.TestBase;

public class SelectmemberTypePage extends TestBase {
	
	@FindBy(xpath="//h1[@class='page-title tellus-header']")
	WebElement qualifier_Page_Heading;
	
	@FindBy(id="architect")
	WebElement architectRadiaBtn;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueBtn;
	
	public SelectmemberTypePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String  verifySelectmemberTypePageTtile(){
		return driver.getTitle();		
	}
	
	public String getPageHeading(){
		//WebDriverWait wait = new WebDriverWait(driver,30);
	   // WebElement heading = wait.until( ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='page-title tellus-header']")));
	    try{
			Thread.sleep(2000);
			}catch(Exception e)
			{
				
			}	
	    return qualifier_Page_Heading.getText();
		
	}
	public void  selectArchtypeQualifier(){
		architectRadiaBtn.click();
		
	}
	public String  clickOnContinueBtn(){
		continueBtn.click();		
		return new PersonalAndContactInformationPage().getPersonalandContactPageHeading();
		
	}

}
