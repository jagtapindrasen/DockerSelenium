package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class SeleniumDocker {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//Selenium standadlone execution
		// To check if server is up and running you can use http://192.168.68.100:4444 or http://localhost:4444/ui
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver d = new RemoteWebDriver(url,dc);
		d.get("https://facebook.com/");
		System.out.println(d.getTitle());
		Thread.sleep(5000);
		d.quit();

	}

}
