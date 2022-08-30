package wipro.qa.goibo.testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wipro.qa.goibo.pages.AlertHanlesPage;
import wipro.qa.goibo.util.Reusablecomponet;
import wipro.qa.wipro.Base.Base;

public class Testalertpage extends Base{
	
	   WebDriver driver;
	AlertHanlesPage regipage;
	Reusablecomponet rusable;
	
	@BeforeTest
	public void setup() {
		driver=driverLauch();
		regipage=new AlertHanlesPage(driver);
		rusable=new Reusablecomponet(driver);
	}
	@Test
	public void executeTestcase() throws InterruptedException {
		regipage.clickonalertpag(properties.getProperty("alertwithxpath"));
		regipage.clickandcanlepage(properties.getProperty("alertwithokcancelxpath"), properties.getProperty("confirmboxalertxpath"));
	    regipage.prompt(properties.getProperty("alertwithtextboxxpath"), properties.getProperty("promtxboxxpath"));
	}
@AfterTest
public void closebrowse() throws IOException {
	System.out.println("chand");
	driver.close();
}
}
