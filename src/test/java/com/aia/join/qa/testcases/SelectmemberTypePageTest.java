package com.aia.join.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.pages.LoginPage;
import com.aia.join.qa.pages.SelectmemberTypePage;

public class SelectmemberTypePageTest extends TestBase{
	
	SelectmemberTypePage membershipQualifierPage;
	LoginPage loginPage;
	
	public SelectmemberTypePageTest(){
		super();		
	}
	
	@BeforeMethod
	public void setUp(){		
		initialization();		
		membershipQualifierPage=new SelectmemberTypePage(); 	
		loginPage=new LoginPage(); 		
		String  heading=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	/*@Test(priority=1)
	public void loginPageTitleTest(){
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals("title","");
		
	}
	*/
	/*@Test(priority=1)
	public void logoTest(){
		////boolean flag= loginPage.validateLogoIamge();
		//Assert.assertTrue(flag);		
	}*/
	
	//@Test(priority=1)
	public void selectQualifierClickContinue(){
		/*SelectmemberTypePage selectmemberTypePage=  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		String title=selectmemberTypePage.verifySelectmemberTypePageTtile();*/
		System.out.println("********");
		membershipQualifierPage.selectArchtypeQualifier();
		String heading=membershipQualifierPage.clickOnContinueBtn();
		Assert.assertEquals(heading, "Personal and contact info");
	}
	
	/*@AfterMethod
	public void tearDown(){		
		driver.quit();
	}
		*/

}
