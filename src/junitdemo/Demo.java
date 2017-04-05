package junitdemo;

import org.junit.*;

/**
 * Created by Ashwini on 3/14/2017.
 */
public class Demo {
    @BeforeClass
    public static void testBefore()
    {
        System.out.println("testBefore");
    }
    @AfterClass
    public static void testAfter()
    {
        System.out.println("testAfter");
    }
  @Test
    public void test()
  {
      System.out.println("test");
  }


    @Before
    public void test1()
    {
        System.out.println("test1");
    }


    @After
    public void test2()
    {
        System.out.println("test2");
    }

    @Test
    public void test3()
    {
        System.out.println("test3");
    }


}
