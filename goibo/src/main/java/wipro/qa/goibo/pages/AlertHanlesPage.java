package wipro.qa.goibo.pages;

import org.openqa.selenium.WebDriver;

import wipro.qa.goibo.util.Reusablecomponet;
import wipro.qa.wipro.Base.Base;

public class AlertHanlesPage extends Base{
	
	Reusablecomponet reusable=new Reusablecomponet(driver);
	public AlertHanlesPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickonalertpag(String str)  {
		 reusable.accetpAlertreus(str);
		 	 
	}
	
	
	
	
	public void clickandcanlepage(String str, String Str1) {
		      reusable.alertwithokCancel(str, Str1);
		      
	}
	public void prompt(String str, String str1) {
		reusable.promptAlert(str, str1);
	}
	
}
