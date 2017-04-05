package junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ashwini on 3/14/2017.
 */
public class Project {
    public WebDriver driver;
@Before
    public void before()
{
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://travel.tfleet.in/");

    driver.findElement(By.id("Email_Id")).sendKeys("bankarashwini1@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("sl7503SL");
    driver.findElement(By.id("btnSubmit1")).click();
}





 @Test
 public void master()
 {
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.findElement(By.linkText("Master")).click();
     driver.findElement(By.linkText("Supplier")).click();
     driver.findElement(By.linkText("Add New")).click();
     driver.findElement(By.id("Serv_1")).click();
     driver.findElement(By.id("Supp_Nm")).sendKeys("viraj");
     driver.findElement(By.id("Supp_Addr")).sendKeys("Urulikanchan");

     Select select=new Select(driver.findElement(By.id("ddlState")));
     select.selectByVisibleText("Andaman and Nicobar Island");

     Select select1=new Select(driver.findElement(By.id("ddlCity")));
     select1.selectByValue("1");

     driver.findElement(By.id("Fax_No")).sendKeys("1234");
     driver.findElement(By.id("ST_Reg_No")).sendKeys("234");
     driver.findElement(By.id("ContNo1")).sendKeys("99999999999");
     driver.findElement(By.id("Cont_Persn")).sendKeys("ankita");
     driver.findElement(By.id("ContNo2")).sendKeys("88888888888");
     driver.findElement(By.id("Sec_Cont_Persn")).sendKeys("kiran");
     driver.findElement(By.name("Supp_Email")).sendKeys("ashwini@gmail.com");
     driver.findElement(By.name("Website")).sendKeys("www.tcraft.com");

     Select select3=new Select(driver.findElement(By.id("ddl_BankNm")));
     select3.selectByValue("1");

   /*  JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("g.click();");
*/
     driver.findElement(By.id("Bank_Acc_No")).sendKeys("235765676");
     driver.findElement(By.id("Branch_Nm")).sendKeys("pune");
     driver.findElement(By.id("Branch_Addr")).sendKeys("puneee");
     driver.findElement(By.id("MICR_No")).sendKeys("453");
     driver.findElement(By.id("IFSC_Code")).sendKeys("45");
     driver.findElement(By.id("btnSubmit")).click();
     driver.findElement(By.xpath(".//*[@id='confirm']")).click();

    // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  /* WebElement g= driver.findElement(By.id("confirm"));
   g.click();
     *//*JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("g.click()");*/

    /* Alert alert=driver.switchTo().alert();
     String ss1=alert.getText();
     System.out.println(ss1);
     alert.accept();*/


 }








}
