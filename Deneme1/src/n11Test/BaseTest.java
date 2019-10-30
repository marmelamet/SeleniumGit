package n11Test;

import java.io.File;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseTest {
	
	 protected static String ChromePath = "C:\\Users\\asus\\Desktop\\seleniumProject\\chromedriver.exe";
     
     protected static ChromeDriverService service;
     
     protected static WebDriver driver;
     
     protected static WebDriverWait wait;
    
     public void TestBase(){
     }
     @BeforeClass
     public static void Setup(){
         
         service = new ChromeDriverService.Builder().
                usingDriverExecutable(new File(ChromePath)).
                usingAnyFreePort().
                build();
         try {
            service.start();
         } catch (Exception e) {
            e.printStackTrace();
         }
         System.setProperty("webdriver.chrome.driver", ChromePath);
         
         driver = new  RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
         
         wait = new WebDriverWait(driver,15);
         
         driver.manage().window().maximize();
      }
      @AfterClass
      public static void Stop(){
          
          driver.quit();
          
          service.stop();
      }

}
