package TestngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMtest {
	
	WebDriver driver;
	@BeforeClass
	 public void openbrowser()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vn22275\\eclipse-workspace\\TestngFramework\\Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		
	}
	@Test
	public void launchapplication() 
	{
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test
	public void logintest() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void Currenturl() throws InterruptedException
	{
		String url=driver.getCurrentUrl();
		Thread.sleep(2000);
	}
	@Test
	public void gettitle() throws InterruptedException
	{
		String title=driver.getTitle();
		Thread.sleep(2000);
		
	}
	@Test
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
}
