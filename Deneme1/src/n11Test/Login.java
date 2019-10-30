package n11Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login extends PageBase {

	public Login(WebDriver driver, WebDriverWait wait) 
	{
        super(driver, wait);
    }
     
     public String email = "eren.acar@hotmail.com.tr"; 
     public String pass = "pass1234*!";  
     public String btnLogin = "btnSignIn";
     public String btnTitle = "Giriþ Yap";
     
     public boolean verifyUsernameAndPassword(String username, String password) throws InterruptedException {
     
     writeText(By.id(email),username); 
     
     click(By.className(btnLogin));
     
     Thread.sleep(500);
     
     if(driver.getCurrentUrl().contains("pwd")){
           
           writeText(By.name(pass),password);
       
           Thread.sleep(600);
          
           return driver.getCurrentUrl().contains("giris");
           }
     else
     {
    	 return false;
     }
     }
}
