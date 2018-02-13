package com.aia.join.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.beans.BGInformationBean;
import com.aia.join.qa.beans.PCInformationBean;
import com.aia.join.qa.beans.PaymentInfoBean;
import com.aia.join.qa.pages.BackGroundPage;
import com.aia.join.qa.pages.LoginPage;
import com.aia.join.qa.pages.PaymentInformationPage;
import com.aia.join.qa.pages.PersonalAndContactInformationPage;
import com.aia.join.qa.pages.SelectmemberTypePage;
import com.aia.join.qa.util.TestUtil;

public class PaymentInfoPageTest extends TestBase {

	LoginPage loginpage;
	SelectmemberTypePage membershipQualifierPage;
	PersonalAndContactInformationPage personalAndContactInformationPage;
	BackGroundPage backGroundPage;


	public PaymentInfoPageTest(){
		super();

	}

	@BeforeClass
	public void setup(){ 
		initialization();		
		//membershipQualifierPage=new SelectmemberTypePage(); 	
		loginpage=new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	

		membershipQualifierPage =new SelectmemberTypePage();
		membershipQualifierPage.selectArchtypeQualifier();
		membershipQualifierPage.clickOnContinueBtn();	

	}


	@DataProvider
	public Object[][] getPCData(){
		Object data[][] = TestUtil.getTestData("pc");
		return data;
	}


	@Test(priority=1, dataProvider="getPCData")
	public void getPCDetailsFromExcelandEnterData(String prefix, String firstname, String middleinitial, String lastname,String suffix,String primarycontactinformation,String country,String phonenumber,	String registermembershiplocation,		

			String duesradioption,String primaryaddress,String home_country,String home_addline1,String home_addline2,String home_city,String home_address_state, String home_zipcode,String ishomeprimarymailing,String work_lookupname,String isworkprimarymailing){



		PCInformationBean pCInformationBeanObj=new PCInformationBean();		
		pCInformationBeanObj.setPrefix(prefix);
		pCInformationBeanObj.setFirstName(firstname);
		pCInformationBeanObj.setMiddleInitial(middleinitial);		
		pCInformationBeanObj.setLastName(lastname);
		pCInformationBeanObj.setSuffix(suffix);	

		pCInformationBeanObj.setPrimaryContactInformation(primarycontactinformation);

		pCInformationBeanObj.setCountry(country);
		pCInformationBeanObj.setPhoneNumber(phonenumber);		
		pCInformationBeanObj.setMembershipLocation(registermembershiplocation);		



		if(registermembershiplocation.equals("home")){

			pCInformationBeanObj.setHomeCountry(home_country);
			pCInformationBeanObj.setHomeAddressLine1(home_addline1);
			pCInformationBeanObj.setHomeAddressLine2(home_addline2);
			pCInformationBeanObj.setHomeAddressCity(home_city);
			pCInformationBeanObj.setHomeAddressState(home_address_state);
			pCInformationBeanObj.setHomeAddressZipcode(home_zipcode);
			pCInformationBeanObj.setHomePrimaryMailingAddress(ishomeprimarymailing);

		}else{
			pCInformationBeanObj.setWorkLookupName(work_lookupname);
			pCInformationBeanObj.setWorkPrimaryMailingAddress(isworkprimarymailing);
		}



		personalAndContactInformationPage =new PersonalAndContactInformationPage();
		String backGroundPageHeading= personalAndContactInformationPage.enterPersonalandContactPageHeadingData(pCInformationBeanObj);		
		Assert.assertEquals(backGroundPageHeading, "Your background");

	}

	@DataProvider
	public Object[][] getBGData(){
		Object data[][] = TestUtil.getTestData("bgPage");
		return data;
	}


	@Test(priority=2, dataProvider="getBGData")
	public void getBGDetailsFromExcelandEnterData(String LicenseState, String LicenseNumber, String IssueDate, String ExpirationDate){


		BGInformationBean BGInformationBeanObj=new BGInformationBean();		
		BGInformationBeanObj.setLicenseState(LicenseState);;
		BGInformationBeanObj.setlicenseNumber(LicenseNumber);


		BGInformationBeanObj.setIssueDate(IssueDate);
		BGInformationBeanObj.setExpirationDate(ExpirationDate);

		backGroundPage=new BackGroundPage();
	//	backGroundPage.enterLicenseInfo(BGInformationBeanObj);
		String pageHeading = backGroundPage.enterLicenseInfo(BGInformationBeanObj);
		Assert.assertEquals(pageHeading,"Payment information");

	}

	@DataProvider
	public Object[][] getPaymentData(){
		System.out.println("kmkm1");
		Object data[][] = TestUtil.getTestData("payment");
		System.out.println("kmkm2");
		return data;
	}

	@Test(priority=3, dataProvider="getPaymentData")
	public void getPaymentDetailsFromExcelandEnterData(String NameOnCard, String CardNo, String securityCode){
		PaymentInfoBean paymentInfoBeanObj=new PaymentInfoBean();
		paymentInfoBeanObj.setNameOnCard(NameOnCard);
		//paymentInfoBeanObj.setCreditCardNumber(CardNo);
		paymentInfoBeanObj.setCreditCardNumber(CardNo.substring(0,CardNo.length()-3).replaceAll("[^0-9]", ""));
		//paymentInfoBeanObj.setSecurityCode(securityCode);
		paymentInfoBeanObj.setSecurityCode(new Float(securityCode).intValue()+"");
		PaymentInformationPage  paymentInformationPageObj=new PaymentInformationPage();
		paymentInformationPageObj.enterCreditDebitPaymentData(paymentInfoBeanObj);
		
		
	}
	


}