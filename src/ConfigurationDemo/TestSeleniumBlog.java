package ConfigurationDemo;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumBlog {

	@Test
	public void testconfig() throws Exception {
		File src = new File("./Configuration/Config.property");
		FileInputStream fis = new FileInputStream(src);
		Properties pro = new Properties();
		pro.load(fis);
	String chromepath=pro.getProperty("ChromeDriver");
	System.out.println("Hey Chrome Path is ===="+chromepath);
		
	}
}
