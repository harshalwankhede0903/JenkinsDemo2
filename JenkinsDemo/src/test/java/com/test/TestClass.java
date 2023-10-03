package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    	 driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
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
