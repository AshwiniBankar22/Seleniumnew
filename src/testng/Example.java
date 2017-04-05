package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Ashwini on 3/17/2017.
 */
public class Example {
    /*@BeforeSuite
    public void before()
    {
     System.out.println("Beforesuite");
    }

    @AfterSuite
    public void after()
    {
        System.out.println("Aftersuite");
    }*/

    @Test
    public void test()
    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://scriptinglogic.com/");
        String actual=driver.getTitle();
        System.out.println(actual);
        Assert.assertEquals("Scripting Logic – Learn | Discuss | Explore", actual);

        //Assert.assertEquals("dggtdg",driver.getTitle());
    }


















}
