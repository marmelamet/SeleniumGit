package n11Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import n11Test.Home;
import n11Test.Login;

public class LoginTest extends BaseTest {

	@Test
    public void valid_UsernameAndPassword()throws InterruptedException {
       
        Home home = new   Home(driver,wait);
        Login login = new   Login(driver,wait);
        
        home.click(By.id(home.btnMenuLogIn));
       
        assertEquals(
        login.verifyUsernameAndPassword("eren.acar@hotmail.com.tr",
                                         "pass1234*!"),true);
    }
    @Test
    public void invalid_UsernameAndPassword() throws InterruptedException {
       
        Home home = new   Home(driver,wait);
        Login login = new   Login(driver,wait);
        
        home.click(By.id(home.btnMenuLogIn));
        
        assertEquals(  
         login.verifyUsernameAndPassword("eren.acar@hotmail.com.tr",
                                          "nonpasswordpassword"),false);
    }
    @Test
    public void   empty_UsernameAndPassword()throws   InterruptedException {
        
        Home home = new   Home(driver,wait);
        Login login = new   Login(driver,wait);
       
        home.click(By.id(home.btnMenuLogIn));
        
        assertEquals(login.verifyUsernameAndPassword("",""),
                                                        false);
    }
    
    @Test
    public void checkSearch() {
    	
     String url = "https://www.n11.com/arama?q=bilgisayar";
     
     if(driver.getCurrentUrl().contains(url)) {
     
     System.out.println("Bilgisayar aramasý yapýldý");
      
     } 
     
     driver.close();
      
    }
    }

