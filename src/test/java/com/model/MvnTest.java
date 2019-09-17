package com.model;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MvnTest 
{
	public WebDriver driver;
 
 @Test(priority=1,description="Verify that valid user1 able to login into Mercury tours application by using valid username and password")
  public void loginwithValidds1()
   {
	 System.out.println("In loginwithValidds method under Test");
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap1");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
	 driver.findElement(By.xpath("//input[@name='login']")).click();
	 boolean flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	 System.out.println("Flight Finder image is deisplayed: "+flag);
	 driver.findElement(By.linkText("SIGN-OFF")).click();
	 
   }
 
 @Test(priority=2,description="Verify that valid user2 able to login into Mercury tours application by using valid username and password")
 public void loginwithValidds2()
  {
	 System.out.println("In loginwithValidds method under Test");
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap2");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword2");
	 driver.findElement(By.xpath("//input[@name='login']")).click();
	 boolean flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")).isDisplayed();
	 System.out.println("Flight Finder image is displayed: "+flag);
	 driver.findElement(By.linkText("SIGN-OFF")).click();
  }
 
 
 @Test(priority=3,description="Verify that invalid user not able to login into Mercury tours application by using invalid username and password")
 public void loginwithInValidds()
  {
	 System.out.println("In loginwithValidds method under Test");
	 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Suvidyap");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword");
	 driver.findElement(By.xpath("//input[@name='login']")).click();	 
	 boolean flag=driver.findElement(By.xpath("//img[@src='/images/masts/mast_signon.gif']")).isDisplayed();
	 System.out.println("Sign On image is displayed: "+flag);
	 
  }
  @BeforeMethod
  public void getAllCookies() 
  {
	  System.out.println("In getAllCookies method BeforeMethod");
	  Set<Cookie> cookies=driver.manage().getCookies();
	  for(Cookie cookie:cookies)
	  {
		  System.out.println(cookie.getName());
	  }
  }

  @AfterMethod
  public void captureScreenshot() throws IOException 
  {
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFileToDirectory(src, new File("F:\\Suvidya_data\\Java_Selenium\\MercuryTsProjectDemo\\src\\test\\resources\\Screenshots\\"));
      System.out.println("Screenshot is captured successfully");
  }

  @BeforeClass
  public void maximizeBrowser() 
  {
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void deleteAllCookies() 
  {
	  driver.manage().deleteAllCookies();
  }

  @BeforeTest
  public void enterApplicationURL() 
  {
	  System.out.println("In enterApplicationURL method under BeforeTest");
	  driver.get("http://newtours.demoaut.com/mercurywelcome.php");
  }

  @AfterTest
  public void dbConnectionClosed() 
  {
	  System.out.println("dbConnectionClosed method under AfterTest");
  }

  @BeforeSuite
  public void openBrowser() 
  {
	  System.out.println("Enter code in Github AAAAAA LLLLLLLL");
	  System.out.println("In openBrowser method under BeforeSuite");
	  System.setProperty("webdriver.chrome.driver", "E:\\Seleniumdownload\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("Chrome browser is opened successfully");
  }

  @AfterSuite
  public void closeBrowser() 
  {
	  driver.close();
	  System.out.println("Ranjita1155555");
	  System.out.println("ggdhsfhgsdfsfd");
	  System.out.println("sdfdsg");
	 System.out.println("Updated in  Github Master");
	   System.out.println("2nd way to update in local");
  }

}
