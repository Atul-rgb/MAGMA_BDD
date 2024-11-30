package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
	public WebDriver lounchBrowser() throws Exception {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties properites=new  Properties();
		properites.load(fis);
	String url=	properites.getProperty("UATurl");
		if(driver==null) {
			if(properites.getProperty("browser").equalsIgnoreCase("chrome")) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\atul.dhote\\eclipse-workspace\\cucumbernewframewor\\DriverNew\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\DriverNew\\chromedriver.exe");
		driver =new ChromeDriver();
	//	driver.get("https://hbfguatportal.azurewebsites.net");
			}
			
			if(properites.getProperty("browser").equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\atul.dhote\\eclipse-workspace\\cucumbernewframewor\\DriverNew\\chromedriver.exe");
				driver =new ChromeDriver();
			}
		driver.get(url);
			
		}
		return driver;
	}
}
