package wipro.qa.wipro.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public  FileInputStream fs;
	 public   Properties properties;
	 public static WebDriver driver;
	 public  static EventFiringWebDriver e_driver;
 
	public WebDriver driverLauch() {
		try {
			properties=new Properties();
		     fs=new FileInputStream("//Users//c.s.yadav//Documents//Seleniumlaeringproject//goibo//src//main//java//wipro//qa//goibo//configration//config.properties");
		     properties.load(fs);
		     WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		     driver.manage().window().maximize();
		     driver.manage().deleteAllCookies();
		     driver.get(properties.getProperty("windowurl"));
		   
	}
		catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
		return driver;
	}


}

