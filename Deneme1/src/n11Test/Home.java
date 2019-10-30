package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends PageBase {

	public Home(WebDriver driver, WebDriverWait wait) {
        super(driver,   wait);
     driver.get("https://www.n11.com/");
  }
	
  public String btnMenuLogIn = "loginButton";
  
  public String checkMenuLinks(String button){
     click(By.id(button));
     return driver.getCurrentUrl();
  }
  
}
