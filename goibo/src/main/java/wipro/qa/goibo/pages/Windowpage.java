package wipro.qa.goibo.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import wipro.qa.goibo.util.Reusablecomponet;
import wipro.qa.wipro.Base.Base;

public class Windowpage extends Base{
	
	Reusablecomponet reusable=new Reusablecomponet(driver);
	
	public Windowpage(WebDriver driver) {
		
	}
	public void handleWindows(String str12) {
		reusable.singleWindowHandles(str12);
		
	}
	public void handleSepwindo(String strrr, String strng) {
		 reusable.seprateWindows(strrr, strng);
	}
public void multiple_Window(String s1, String s2, String s3, String s4, String s5) {
	reusable.multipleWindows(s1, s2, s3,s4,s5);
}
}
