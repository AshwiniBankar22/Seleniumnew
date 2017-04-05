import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Ashwini on 3/23/2017.
 */
public class LoginTravel {
    WebDriver driver;

    @BeforeMethod
    public void launch()
    {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("http://travel.tfleet.in/");
    }

    @Test(dataProvider = "getData")
    public void login(String uname,String pword)
    {
        driver.findElement(By.id("Email_Id")).sendKeys(uname);
        driver.findElement(By.id("Password")).sendKeys(pword);
        driver.findElement(By.id("btnSubmit1")).click();
    }

    @org.testng.annotations.DataProvider
    public String[][] getData() throws IOException {


            FileInputStream file = new FileInputStream("D:\\Ashwini\\Seleniumnew\\src\\seleniumexample.xlsx");
            XSSFWorkbook wbk = new XSSFWorkbook(file);
            XSSFSheet sheet = wbk.getSheet("Sheet1");
            int noofrows = sheet.getPhysicalNumberOfRows();
            System.out.println(noofrows);


            String [][]data=new String[noofrows-1][2];

            for (int i = 1; i < noofrows; i++) {
                XSSFRow row=sheet.getRow(i);
                XSSFCell cell=row.getCell(0);
                String a1Val = cell.getStringCellValue();
                data[i-1][0]=a1Val;
                System.out.println(a1Val);

                XSSFCell cell1=row.getCell(1);
                String a1Val1 = cell1.getStringCellValue();
                data[i-1][1]=a1Val1;
                System.out.println(a1Val1);




            }


        return data;

    }

}
