package com.testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SamplTest {
	 WebDriver driver;
	@BeforeTest
	 public void opernurl() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vn22275\\eclipse-workspace\\Demo\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://darwinbox.com/products/travel-and-expense");
		
		
	   
		
		
		
	}
	@Test
	 public void identifytitle() {
		
		String url=driver.getTitle();
		System.out.println(url);
		
	}
	@AfterTest
	 public void closebrowser() {
		
		driver.close();
		
		
	}


}
