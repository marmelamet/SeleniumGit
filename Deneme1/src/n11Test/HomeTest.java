package n11Test;

import static org.junit.Assert.*;
import org.junit.Test;
import n11Test.BaseTest;

public class HomeTest extends BaseTest {

     @Test
     public void invalid_checkMenuLinks() throws InterruptedException {
       
        Home home = new Home(driver,wait);
   
        assertNotEquals(home.checkMenuLinks(home.btnMenuLogIn),
                            "testLink.com");
      }
}
