package com.aia.join.aia.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aia.join.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties  prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListner;
	
	public  TestBase(){		
		try{
		
		prop = new Properties();		
		//FileInputStream fi=new FileInputStream("/AIAJOINTEST/src/main/java/com/aia/join/qa/config/config.properties");
		FileInputStream fi=new FileInputStream("D:/My Proj/git/joinautomation/src/main/java/com/aia/join/qa/config/config.properties");
		prop.load(fi);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public static void initialization(){
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browserName.equals("firefox")){			
			driver=new FirefoxDriver();			
		}
		
		e_driver=new EventFiringWebDriver(driver);
		eventListner   =new WebEventListener();
		e_driver.register(eventListner);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.get(prop.getProperty("url"));
	}
	
	

}
