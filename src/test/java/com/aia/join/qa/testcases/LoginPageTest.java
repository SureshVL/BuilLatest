package com.aia.join.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aia.join.aia.base.TestBase;
import com.aia.join.qa.pages.LoginPage;


public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	
	public LoginPageTest(){
		super();		
	}
	
	@BeforeMethod
	public void setUp(){		
		initialization();		
		loginPage=new LoginPage(); 		
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
	public void loginTest(){
		/*SelectmemberTypePage selectmemberTypePage=  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
		String title=selectmemberTypePage.verifySelectmemberTypePageTtile();*/
		String heading=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("page title  "+heading);;
		Assert.assertEquals(heading, "Tell us who you are");
	}
	
	//@AfterMethod
	public void tearDown(){		
		driver.quit();
	}
		

}
