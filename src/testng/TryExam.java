package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ashwini on 3/18/2017.
 */
public class TryExam {
    WebDriver driver;
    @BeforeClass
    public void login()
    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://travel.tfleet.in/");
        driver.findElement(By.id("Email_Id")).sendKeys("bankarashwini1@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("rt7209RT");
        driver.findElement(By.id("btnSubmit1")).click();
    }
    @Test
    public void test() {

  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expected="Travel";
            WebElement actual=driver.findElement(By.xpath("//header[@class='main-header']/a/b"));
           actual.getText();
        Assert.assertEquals(expected,actual);

    }
}
