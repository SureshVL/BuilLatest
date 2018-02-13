package com.aia.join.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.beans.BGInformationBean;

public class BackGroundPage extends TestBase {

	@FindBy(xpath="//h1[@class='page-title pci-block']")
	WebElement backGround_Page_Heading;

	@FindBy(xpath="//label[@for='licenseState']/../div/span[contains(text(),'Select')]")
	WebElement licenseStateSelect;

	@FindBy(xpath ="//div[@class='ember-power-select-search']/input")
	WebElement licenseStateSelectSearchBox;


	@FindBy(xpath ="//li[@class='ember-power-select-option' and text()='Alaska']")
	WebElement alaskaStateOption;



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


	@FindBy(xpath ="//div[@class='datepicker-months']//tfoot")
	WebElement dateClear;

	@FindBy(xpath ="	//span[@class='month' and text()='Jan']")
	WebElement monthJan;

	@FindBy(xpath ="	//span[@class='month' and text()='Dec']")
	WebElement monthDec;	

	@FindBy(xpath ="//label[@for='licenseState'][1]/following-sibling::div[1]")
	WebElement 	licenseState;

	@FindBy(xpath ="//div[@class='ember-power-select-search']/..//ul/li[text()='Alaska']")
	WebElement 	alaskaState;

	@FindBy(xpath= "//input[@name='licenseAwardedDate']")
	WebElement issuedateBox ;


	@FindBy(xpath= "//input[@id='edit-next']")
	WebElement bgContinueBTN ;

	@FindBy(xpath= "//h1[text()='Payment information']")
	WebElement paymentPageHeading ;

//
	
	//Methods//
	
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



	public String enterLicenseInfo(BGInformationBean BGInformationBeanObj){

		licenseStateSelect.click();
		licenseStateSelectSearchBox.sendKeys(BGInformationBeanObj.getLicenseState());
		alaskaStateOption.click();			
		//	licenseNumber.sendKeys(BGInformationBeanObj.getlicenseNumber());
		licenseNumber.sendKeys("123456");
		issueDate.click();
		dateClear.click();
		issueDate.click();
		monthJan.click();
		expirationDate.click();
		dateClear.click();
		expirationDate.click();
		monthDec.click();
		bgContinueBTN.click();
		try{
			Thread.sleep(1000);
		}catch(Exception e)
		{

		}	
		String paymentHeading = backGround_Page_Heading.getText();
		return paymentHeading;



	}


}
