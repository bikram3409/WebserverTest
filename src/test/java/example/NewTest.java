package example;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
		

		// Open url
		driver.get("https://educator-slz02.scholasticlearningzone.com/slz-portal/#/login3/INDDPQQ");
		
		Thread.sleep(3000);
		
		// Enter UserName 
				driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("Teacher1");
				
		// Enter Password 
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("welcome1");
						
		// Click login button
				
				driver.findElement(By.xpath("html/body/div[1]/div[4]/div/div/div[1]/div[1]/section[1]/div/form/button")).click();

				Thread.sleep(3000);
				
				WebElement element = driver.findElement(By.xpath("html/body/div/div[3]/nav/div[1]/img"));
				String title = element.getAttribute("Scholastic Learning Zone");
				
				System.out.println(driver.getTitle());

				
  }	
	@BeforeTest
	public void beforeTest() throws IOException {	
		
		String UploadedFilePath = new File(".").getCanonicalPath()
				 + "/driver/geckodriver";
		System.setProperty("webdriver.gecko.driver",UploadedFilePath);
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		System.out.println("Debug 2");
		capabilities.setCapability("marionette", true);
		System.out.println("Debug 3");
  	 driver = new FirefoxDriver(capabilities);
//	driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
	  
  }
