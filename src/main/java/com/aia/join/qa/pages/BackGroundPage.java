package com.aia.join.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.beans.PCInformationBean;

public class BackGroundPage extends TestBase {
	
    @FindBy(xpath="//h1[@class='page-title pci-block']")
	WebElement backGround_Page_Heading;
	
	@FindBy(xpath="//label[@for='licenseState']/../div/span[contains(text(),'Select')]")
	WebElement licenseStateSelect;
	
	@FindBy(xpath ="//div[@class='ember-power-select-search']/input")
	WebElement licenseStateSelectSearchBox;
	
	
	@FindBy(xpath ="//input[@name='licenseNumber']")
	WebElement licenseNumber;
	
	
	@FindBy(xpath ="//input[@name='licenseAwardedDate']")
	WebElement issueDate;
	
	
	@FindBy(xpath ="//input[@name='licenseExpiredDate']")
	WebElement expirationDate;
	
	@FindBy(xpath ="//div[@class='datepicker-months']//th[@class='prev']")
	WebElement previousMonth;
	
	@FindBy(xpath ="//div[@class='datepicker-months']//th[@class='next']")
	WebElement nextMonth;
	
	@FindBy(xpath ="//div[@class='datepicker-months']//th[@class='datepicker-switch']")
	WebElement changeYear;
	
	@FindBy(xpath ="//div[@class='datepicker-years']//th[@class='datepicker-switch']")
	WebElement yearRange;
	
	
	@FindBy(xpath ="//div[@class='datepicker-years']//span[1]")
	WebElement yearSelect;
	

	@FindBy(xpath ="//label[@for='licenseState'][1]/following-sibling::div[1]")
	WebElement 	licenseState;
	
	@FindBy(xpath ="//div[@class='ember-power-select-search']/..//ul/li[text()='Alaska']")
	WebElement 	alaskaState;
	
	@FindBy(xpath= "//input[@name='licenseAwardedDate']")
	WebElement issuedateBox ;
	

	
	
	
	
/*
	@FindBy(xpath ="//div[@class='datepicker-months']//span[1]")
	WebElement monthSelect;
	
	

	@FindBy(xpath ="//div[@class='datepicker-months']//span[1]")
	WebElement monthSelect;*/
//test checkin

	
	
	public BackGroundPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String getBackGroundPageHeading(){		
	    try{
			Thread.sleep(3000);
			}catch(Exception e)
			{
				
			}	
	    return backGround_Page_Heading.getText();
		
	}
	
	
	
	public void enterLicenseInfo(PCInformationBean BGInformationBeanObj){
		
		licenseStateSelect.click();
		licenseStateSelectSearchBox.sendKeys("alaska");
		alaskaState.click();
		licenseNumber.sendKeys("12345");
		issuedateBox.sendKeys("09232001");
		
		
		
	}
	
	
	
	
	
	
	
	
}
