package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Ashwini on 3/16/2017.
 */
public class B {
    @Test
    public void printB1()
    {
        System.out.println("B1");
    }
    @Test
    public void printB2()
    {
        System.out.println("B2");
    }

    @BeforeSuite
    public void before()
    {
        System.out.println("Beforesuite");
    }

    @AfterSuite
    public void after()
    {
        System.out.println("Aftersuite");
    }




}
