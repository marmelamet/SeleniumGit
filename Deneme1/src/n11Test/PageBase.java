package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
	
	  public WebDriver driver;
	     public WebDriverWait wait;

		public PageBase(WebDriver driver, WebDriverWait wait) {
			 this.driver = driver;
	         this.wait = wait;
		}

		public void click (By Sepetim) {
	         driver.findElement(Sepetim).click();
	     }
	     
	     public void writeText (By email, String text) {
	         driver.findElement(email).clear();
	         driver.findElement(email).sendKeys("eren.acar@hotmail.com.tr");
	     }
	     
	     public void writePass (By password, String text) {
	         driver.findElement(password).clear();
	         driver.findElement(password).sendKeys("pass1234*!");
	     }

	}



