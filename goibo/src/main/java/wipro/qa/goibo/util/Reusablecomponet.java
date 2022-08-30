package wipro.qa.goibo.util;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;

import wipro.qa.wipro.Base.Base;

public class Reusablecomponet extends Base{
	
	
	public Reusablecomponet(WebDriver driver) {
		this.driver=driver;
	}

	public void accetpAlertreus(String str) {
		   WebElement element  = driver.findElement(By.xpath(str));
		     element.click();
		     Alert alert1= driver.switchTo().alert();
		     System.out.println("alert 1"+alert1.getText());
		    alert1.accept();
	}
	public void alertwithokCancel(String str, String str1) {
		 WebElement element  = driver.findElement(By.xpath(str));
		 element.click();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		     WebElement ele= driver.findElement(By.xpath(str1));
		        ele.click();
		        try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        	Alert alert2= driver.switchTo().alert(); 
		  		  System.out.println("alert 2"+alert2.getText());
		  		    alert2.dismiss();   
		       
	}
	
	public void promptAlert(String str, String str1) {
		WebElement element  = driver.findElement(By.xpath(str));
		  element.click();
		  WebElement element1  = driver.findElement(By.xpath(str));
		     element1.click();
		     System.out.println(element1.getText());
		 Alert alert3= driver.switchTo().alert(); 
		 System.out.println("alert 3"+alert3.getText());
           element.sendKeys("heloo");
           alert3.accept();
	}
	
	public void singleWindowHandles(String str) {
		 
		  String parent_window=driver.getWindowHandle(); 
		     System.out.println("parenet"+parent_window);
		  driver.findElement(By.xpath(str)).click();
		   Set<String>  All_windows =driver.getWindowHandles();
		  for(String namewindow: All_windows) {
			  System.out.println("allwind"+namewindow);
			  if(!parent_window.equalsIgnoreCase(namewindow)) {
				  driver.switchTo().window(namewindow);
				  System.out.println(driver.getTitle());
				  driver.close();
			  }
			  driver.switchTo().window(parent_window);
		  }
		 
		
	}
	public void seprateWindows(String str, String str1) {
		     driver.findElement(By.xpath(str)).click();
		  String parentwindow=driver.getWindowHandle();
		     System.out.println(parentwindow);
		         driver.findElement(By.xpath(str1)).click();
		  Set<String> all_windows =driver.getWindowHandles();
		       for(String name: all_windows) {
		    	   System.out.println(name);
		    	     if(!parentwindow.equalsIgnoreCase(name)) {
		    	    	 driver.switchTo().window(name);
		    	    	 driver.close();
		    	     }
		    	     if(parentwindow.equalsIgnoreCase(name)) {
		    	    	 driver.switchTo().window(parentwindow);
		    	     }
		       }
	}
	
	
	public void multipleWindows(String str, String str1, String sr2,String value, String str3) {
	 driver.findElement(By.xpath(str)).click();
	  String parent_window=driver.getWindowHandle(); 
	     System.out.println("Multiplewindos"+parent_window);
	   driver.findElement(By.xpath(str1)).click();
	   Set<String>  All_windows  =driver.getWindowHandles();
	      System.out.println("multiple"+All_windows);
	   for(String name: All_windows) {
	     if(!parent_window.equalsIgnoreCase(name)) {
	    	 driver.switchTo().window(name);
	    	 driver.findElement(By.xpath(sr2)).sendKeys(value);
	    	  driver.findElement(By.xpath(str3)).click();
	     }
	     if(parent_window.equalsIgnoreCase(name)) {
	    	 driver.switchTo().window(name);
	    	 
	     }
	   } 
	   
	   
	}
}
	

