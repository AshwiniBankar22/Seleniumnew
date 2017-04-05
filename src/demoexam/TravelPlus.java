package demoexam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ashwini on 3/11/2017.
 */
public class TravelPlus {
    public static void main(String [] args)
    {

            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("http://travel.tfleet.in/");
            driver.findElement(By.id("Email_Id")).sendKeys("bankarashwini1@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("rt7209RT");
            driver.findElement(By.id("btnSubmit1")).click();
        }catch (Exception e)
        {
            System.out.println(e);
        }
        driver.findElement(By.linkText("Master")).click();
        driver.findElement(By.linkText("Supplier")).click();
        driver.findElement(By.linkText("Add New")).click();
        driver.findElement(By.id("Serv_1")).click();
        driver.findElement(By.id("Supp_Nm")).sendKeys("Ashwini");
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

        driver.findElement(By.id("Bank_Acc_No")).sendKeys("235765676");
     driver.findElement(By.id("Branch_Nm")).sendKeys("pune");
        driver.findElement(By.id("Branch_Addr")).sendKeys("puneee");
        driver.findElement(By.id("MICR_No")).sendKeys("453");
        driver.findElement(By.id("IFSC_Code")).sendKeys("45");
      driver.findElement(By.id("btnSubmit")).click();

   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Alert alert=driver.switchTo().alert();
       String ss1=alert.getText();
     System.out.println(ss1);
        alert.accept();




    }
}
