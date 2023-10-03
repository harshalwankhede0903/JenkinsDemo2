package com.test;

import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass 
{
	WebDriver driver;
	
	@BeforeMethod
    public void setup()
    {
    	 if(System.getProperty("browser").equalsIgnoreCase("Chrome"))
    	 {
    		 driver = new ChromeDriver();
    	 }
    	 else if (System.getProperty("browser").equalsIgnoreCase("Firefox"))
    	 {
    		 driver = new FirefoxDriver();
		 }
    	 
    	 driver.manage().window().maximize();
    	 driver.get(System.getProperty("url"));
    	 System.out.println("browser launch successfully..");
    	 System.out.println("browser open......");
    }

    
	@Test
	public void test1()
	{
		System.out.println("This is test case 1");
	}

	@Test
	public void test2()
	{
		System.out.println("This is test case 2");
	}

	@Test
	public void test3()
	{
		System.out.println("This is test case 3");
	}

    @AfterMethod
	public void tearDown()
	{
		driver.close();
	}











}
