package com.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterisation {

	

	@Parameters({ "browser", "url", "username" })
	@Test
	public void Logincheck(String a,String b,String c) {
		
		try {
			System.out.println(a);
//			//if (bro.equals("chrome")) {
		//WebDriver driver;
			//System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
			//driver = new ChromeDriver();
//			//}
			
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
			System.out.println("00000000000");
			WebDriver driver=new ChromeDriver();
			System.out.println("qqqqqqqqqqqqqqqq");
			driver.get("https://login.salesforce.com");
//			driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
//			driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("hh");
	//
			
		} catch(Exception e) {
			System.out.println("1111111111111");
			e.printStackTrace();
		}

	}

//	@Test
//	public void Logincheck1() {
//		System.out.println("aaaaa");
//	}
}
