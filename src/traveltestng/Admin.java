package traveltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Ashwini on 3/21/2017.
 */
public class Admin {
    WebDriver driver;
    @Test
    public void userMaster()
    {
        driver.findElement(By.linkText("Admin")).click();
    }
}
