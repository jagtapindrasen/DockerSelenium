package example;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumGridDocker {
	
	@BeforeSuite
	public void startContainer() {
		CommonMethods.runTerminal("docker-compose up", "Registered a node");
		
	}
		@Test				
		public void testEasy() throws MalformedURLException, InterruptedException {	

		        
				DesiredCapabilities dc = new DesiredCapabilities().firefox();
		    	URL url = new URL("http://localhost:4444/wd/hub");
				WebDriver d = new RemoteWebDriver(url,dc);
				d.get("http://demo.guru99.com/test/guru99home/");
				System.out.println(d.getTitle());
				Thread.sleep(3000);      
				d.quit();		
				System.out.println("Bapu Krupa Ani");

		}	
		
//		@Test
//	    public void testMethodsTwo() throws MalformedURLException, InterruptedException {
//			DesiredCapabilities dc = new DesiredCapabilities().chrome();
//			URL url = new URL("http://localhost:4444/wd/hub");
//			WebDriver d = new RemoteWebDriver(url,dc);
//			d.get("https://facebook.com/");
//			System.out.println(d.getTitle());
//			Thread.sleep(3000);
//			d.quit();		
//
//	    }
		
		@AfterSuite
		public void stopContainer() {
			CommonMethods.runTerminal("docker-compose down", "Removing");

			
		}
	
//		@AfterTest
//		public void afterTest() {
//			
//			
//		}	


}
