package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestSeleniuminChrome {
	ConfigReader config;
	@BeforeTest
	public void setUp() {
		ConfigReader config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
	}
@Test
public void testChrome() throws Exception {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get(config.getApplicationUrl());
	driver.manage().window().maximize();
	
	
	
}


}
