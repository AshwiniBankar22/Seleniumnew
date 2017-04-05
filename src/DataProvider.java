import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by Ashwini on 3/22/2017.
 */
public class DataProvider {
    @Test(dataProvider="getData")
    public void login(String username,String password)
    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://travel.tfleet.in/");
        driver.findElement(By.id("Email_Id")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("btnSubmit1")).click();
    }


    @org.testng.annotations.DataProvider
    public Object[][] getData()
    {
        Object [][] data=new Object[3][2];

        data[0][0]="Ashwini";
        data[0][1]="bankar";

        data[1][0]="ankita";
        data[1][1]="bankar";

        data[2][0]="ankita";
        data[2][1]="bankar";

    return data;
    }
}
