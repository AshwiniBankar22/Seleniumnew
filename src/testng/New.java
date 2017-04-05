package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Ashwini on 3/18/2017.
 */
public class New {
    @Test
    public void login() {
        try {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.id("email")).sendKeys("ashwini.b2@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("12345");
            driver.findElement(By.id("u_0_q")).click();
            String expected="cebook";
            String actual=driver.getTitle();
            Assert.assertEquals(expected,actual);


        }catch (Throwable er)
        {
            System.out.println(er);
            System.out.println("end");
        }
    }

}
