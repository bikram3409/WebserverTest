package example;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
		

		// Open url
		driver.get("https://educator-slz02.scholasticlearningzone.com/slz-portal/#/login3/INDDPQQ");
		
		
				
  }	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.gecko.driver","/home/bikram/Desktop/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
	  
  }
