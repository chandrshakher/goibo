package wipro.qa.goibo.testCase;




import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import wipro.qa.goibo.pages.Windowpage;
import wipro.qa.wipro.Base.Base;

public class Testwindowpage extends Base{

 private static final Logger log = LogManager.getLogger(Testwindowpage.class.getName());
	
	Windowpage windopage;
	@BeforeTest
	public void setup() {
		log.info("Yadav");
		driver=driverLauch();
		windopage=new Windowpage(driver);

	}
	@Test
	public void testCase() throws InterruptedException {
		windopage.handleWindows(properties.getProperty("clickxpat"));
		//Thread.sleep(5000);
        windopage.handleSepwindo(properties.getProperty("opennewsepwindoxpath"), properties.getProperty("clickpath"));
        windopage.multiple_Window(properties.getProperty("multiplexpat"), 
        		properties.getProperty("muclickxpat"), 
        		properties.getProperty("emailfiedxpath"),
        		properties.getProperty("valuex"),
        		properties.getProperty("arrowxpath"));
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
