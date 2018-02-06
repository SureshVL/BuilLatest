package com.aia.join.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.beans.PCInformationBean;
import com.aia.join.qa.pages.LoginPage;
import com.aia.join.qa.pages.PersonalAndContactInformationPage;
import com.aia.join.qa.pages.SelectmemberTypePage;
import com.aia.join.qa.util.TestUtil;

public class PersonalAndContactInformationPageTest extends TestBase{
	
	LoginPage loginPage;
	SelectmemberTypePage membershipQualifierPage;
	PersonalAndContactInformationPage personalAndContactInformationPage;

	
	
	public PersonalAndContactInformationPageTest(){
		super();		
	}
	
	@BeforeMethod
	public void setUp(){		
		initialization();		
		membershipQualifierPage=new SelectmemberTypePage(); 	
		loginPage=new LoginPage(); 		
		String  heading=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
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
		personalAndContactInformationPage.enterPersonalandContactPageHeadingData(pCInformationBeanObj);
		//contactsPage.createNewContact(title, firstName, lastName, company);
		
	}
	
	/*@AfterMethod
	public void tearDown(){		
		driver.quit();
	}
		*/

}
