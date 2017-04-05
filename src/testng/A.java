package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by Ashwini on 3/16/2017.
 */
public class A {


    @BeforeSuite
public void b()
{
    System.out.println("Akshay");
}

    @Test
    public void printA1()
    {
        System.out.println("class_A1");
    }

    @Test
    public void printA2()
    {
        System.out.println("class_A2");
    }
}
