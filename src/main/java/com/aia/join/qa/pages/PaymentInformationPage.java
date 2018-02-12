package com.aia.join.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.beans.PaymentInfoBean;

public class PaymentInformationPage extends TestBase {
	
	
	    @FindBy(xpath="//h1[@class='page-title pci-block' and contains(text(),'Payment information')]")
		WebElement payment_Page_Heading;
		
		@FindBy(xpath="//input[@id='debitOrCredit']")
		WebElement debitOrCredit;
		
		@FindBy(xpath ="//input[@id='nameOnCard']")
		WebElement nameOnCard;
		
		
		@FindBy(xpath ="//input[@id='cardNo']")
		WebElement cardNo;
		
		

		@FindBy(xpath ="//input[@id='expirationDate']")
		WebElement expirationDate;
		

		@FindBy(xpath ="//span[@class='month' and text()='Dec']")
		WebElement monthDec;

		@FindBy(xpath ="//input[@id='securityCode']")
		WebElement securityCode;
		

		@FindBy(xpath ="//label[@class='option' and @for='termsAndCond']")
		WebElement termsAndCond;
		
		@FindBy(xpath ="//input[@value='Submit payment']")
		WebElement submit_Payment;
		
		
		public PaymentInformationPage(){
			PageFactory.initElements(driver, this);
		}
		
		
		public String getPersonalandContactPageHeading(){		
		    
		    return "";
			
		  }
		
		
		public void enterCreditDebitPaymentData(PaymentInfoBean PaymentInfoBeanObj){
			debitOrCredit.click();
			nameOnCard.sendKeys(PaymentInfoBeanObj.getNameOnCard());
			//cardNo.sendKeys("4111111111111111");
			cardNo.sendKeys(PaymentInfoBeanObj.getCreditCardNumber());
			expirationDate.click();
			monthDec.click();
			securityCode.sendKeys(PaymentInfoBeanObj.getSecurityCode());
			termsAndCond.click();
			try {
				Thread.sleep(10000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			submit_Payment.click();
			
			

			 
			
				
		}
		

}
