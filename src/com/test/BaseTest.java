package com.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	//open blank browser
	@Before
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/MAPALA_M/eclipse-workspace/"
				+ "SampleFramework/chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.target.com/");
		Thread.sleep(2000);
	}
	
	//close the browser
	@After
	public void close() {
		driver.quit();
	}
	
	

}
