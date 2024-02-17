package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class NewTest {
	 private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();	
			
			String s = driver.getWindowHandle();
			System.out.println("asdasdas "+ s );
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
			
			 long id = Thread.currentThread().getId();
		        System.out.println("Simple test-method One. Thread id is: " + id);
		}	
		
		@Test
	    public void testMethodsTwo() {
	        long id = Thread.currentThread().getId();
	        System.out.println("Simple test-method Two. Thread id is: " + id);
	    }
		@BeforeTest
		public void beforeTest() {	
			//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			
			//UnComment only the below line to run on firefox 
//			driver = new FirefoxDriver(); 
			//Below things work perfect
			System.setProperty("webdriver.chrome.driver","D:\\Chromedriver_Latest\\chromedriver.exe");
			driver = new ChromeDriver();
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}	
}
