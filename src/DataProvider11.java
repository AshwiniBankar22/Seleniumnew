import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;

/**
 * Created by Ashwini on 3/22/2017.
 */
public class DataProvider11 {
    @Test
    public void test()
    {
        try {
            FileInputStream file = new FileInputStream("D:\\Ashwini\\Seleniumnew\\src\\seleniumexample.xlsx");
            XSSFWorkbook wbk=new XSSFWorkbook(file);
            XSSFSheet sheet=wbk.getSheet("Sheet1");
            int noofrows=sheet.getPhysicalNumberOfRows();
            System.out.println(noofrows);

            for(int i=1;i<noofrows;i++)
            {
                XSSFRow row=sheet.getRow(i);
                XSSFCell cell=row.getCell(0);
                String a1Val = cell.getStringCellValue();
                XSSFCell cellA2 = row.getCell(1);
                String a2Val = cellA2.getStringCellValue();

                System.out.println("username:" + a1Val+", Password:" + a2Val);

            }

        }catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
