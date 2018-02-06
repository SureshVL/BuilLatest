package com.aia.join.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aia.join.aia.base.TestBase;

public class BackGroundPage extends TestBase {
	
/*	@FindBy(xpath="//h1[@class='page-title tellus-header']")
	WebElement qualifier_Page_Heading;
*/	
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
	
/*
	@FindBy(xpath ="//div[@class='datepicker-months']//span[1]")
	WebElement monthSelect;
	
	

	@FindBy(xpath ="//div[@class='datepicker-months']//span[1]")
	WebElement monthSelect;*/


}
