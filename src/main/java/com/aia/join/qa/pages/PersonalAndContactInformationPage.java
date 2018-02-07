package com.aia.join.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.beans.PCInformationBean;

public class PersonalAndContactInformationPage extends TestBase {
	
	@FindBy(xpath="//h1[@class='page-title pci-block']")
	WebElement pcPage_Heading;
	
	//Your Personal Information
	@FindBy(id="_prefix")
	WebElement prefixDropdown;
	
	@FindBy(id="firstname")
	WebElement firstName;
	
	@FindBy(id="middlename")
	WebElement middleName;
	
	@FindBy(id="lastname")
	WebElement lastName;
	
	@FindBy(id="suffix")
	WebElement suffixDropdown;
	
	
	//Your contact information
	
	
	@FindBy(xpath="//ul[@class='field-options-select pnc-form phone-list clearfix']/li[1]//div[1]")
	WebElement homeCountryDropdown;	
	@FindBy(id="homeNumber")
	WebElement homePhoneNumberTextBox;	
	@FindBy(id="phone-home")
	WebElement homeRadioOption;
	
	
	@FindBy(xpath="//ul[@class='field-options-select pnc-form phone-list clearfix']/li[5]//div[1]")
	WebElement mobileCountryDropdown;	
	@FindBy(xpath="//div[@class='ember-power-select-search']/input")
	WebElement countryStateTextBox;	
	@FindBy(xpath="//li[@class='ember-power-select-option'][1]")
	WebElement countryStateOption1;
	
	
	@FindBy(id="mobileNumber")
	WebElement mobileNumberTextBox;	
	@FindBy(id="phone-mobile")
	WebElement mobileRadioOption;	
	
	
	@FindBy(xpath="//ul[@class='field-options-select pnc-form phone-list clearfix']/li[9]//div[1]")
	WebElement workCountryDropdown;	
	@FindBy(id="workNumber")
	WebElement workNumberTextBox;	
	@FindBy(id="phone-work")
	WebElement workRadioOption;	
	
	
	//select memberhsip option home or work
	@FindBy(id="work-home")
	WebElement homeOptionBox;	
	
	@FindBy(id="work-work")
	WebElement workOptionBox;	
	
	
	
	
	//your address information

	@FindBy(xpath="//label[@for='homeAddressCountry']/following-sibling::div[1]")
	WebElement homeAddCountrySelect;
	
	
	@FindBy(id="homeAddressLine1")
	WebElement homeAddressLine1TxtBox;
	
	@FindBy(id="homeAddressLine2")
	WebElement homeAddressLine2TxtBox;
	
	@FindBy(id="homeAddressCity")
	WebElement homeAddressCityTxtBox;
	
//	@FindBy(id="//div[@id='home-address']//label[@for='homeAddressState']/following-sibling::div[1]/span[1]")
//	WebElement homeAddressStateSelect;
//	
	@FindBy(xpath="//label[@for='homeAddressState']/../div/span[contains(text(),'Select')]")
	WebElement homeAddressStateSelect;
	
	
	@FindBy(xpath ="//div[@class='ember-power-select-search']/input")
	WebElement homeAddressStateSelectSearchBox;
	
	@FindBy(id="homeAddressZip")
	WebElement homeAddressZipTxtBox;
	
	
	@FindBy(id="isHomePrimaryMailing")
	WebElement isHomePrimaryMailingOption;
	
	
	
	@FindBy(xpath="//div[@id='personal-contact']/following-sibling::div[2]//a[text()='Continue']")
	WebElement pcContinueBtn;
	
	
	
	
	public PersonalAndContactInformationPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String getPersonalandContactPageHeading(){		
	    try{
			Thread.sleep(3000);
			}catch(Exception e)
			{
				
			}	
	    return pcPage_Heading.getText();
		
	}
	
	
	public String  enterPersonalandContactPageHeadingData(PCInformationBean PCInformationBeanObj){
		
		
		//Entering your personal information data
		lastName.sendKeys(PCInformationBeanObj.getLastName());		
		middleName.sendKeys(PCInformationBeanObj.getMiddleInitial());		
		Select prefix_dropdown = new Select(prefixDropdown);
		prefix_dropdown.selectByVisibleText(PCInformationBeanObj.getPrefix());		
		Select suffix_dropdown = new Select(suffixDropdown);
		suffix_dropdown.selectByVisibleText(PCInformationBeanObj.getSuffix());
		
		
		//Entering your contact information data
		if(PCInformationBeanObj.getPrimaryContactInformation().equals("home")){				
			
		}else if(PCInformationBeanObj.getPrimaryContactInformation().equals("mobile")){			
			mobileRadioOption.click();	
			mobileCountryDropdown.click();
			countryStateTextBox.sendKeys(PCInformationBeanObj.getCountry());
			countryStateOption1.click();
			mobileNumberTextBox.sendKeys(PCInformationBeanObj.getPhoneNumber());			
			//mobileCountryDropdown.sendKeys("UNITE STATES");					
			
		}else if(PCInformationBeanObj.getPrimaryContactInformation().equals("work")){
			
		}
		
		
		//select option membership location home or work
		if(PCInformationBeanObj.getMembershipLocation().equals("home")){		
			homeOptionBox.click();	
			homeAddCountrySelect.click();
			countryStateTextBox.sendKeys(PCInformationBeanObj.getHomeCountry());
			countryStateOption1.click();
			homeAddressLine1TxtBox.sendKeys(PCInformationBeanObj.getHomeAddressLine1());
			homeAddressLine2TxtBox.sendKeys(PCInformationBeanObj.getHomeAddressLine2());
			homeAddressCityTxtBox.sendKeys(PCInformationBeanObj.getHomeAddressCity());
			try{
				Thread.sleep(10000);
				}catch(Exception e)
				{
					
				}	
			
			
			homeAddressStateSelect.click();
			homeAddressStateSelectSearchBox.sendKeys(PCInformationBeanObj.getHomeAddressState());
			countryStateOption1.click();
			
			homeAddressZipTxtBox.sendKeys(PCInformationBeanObj.getHomeAddressZipcode());
			homeAddressLine1TxtBox.click();
			try{
				Thread.sleep(10000);
				}catch(Exception e)
				{
					
				}	
			
			//isHomePrimaryMailingOption.click();
		}else{
			//workOptionBox.click();
		}
		pcContinueBtn.click();
		
		return new BackGroundPage().getBackGroundPageHeading ();

		
		//Entering your address information data
		
		
		
	}
	
	
		

}
