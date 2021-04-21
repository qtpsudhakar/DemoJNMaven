package com.tests;

import org.junit.*;

public class DemoTest {

    @Test
    public void test1(){
        System.out.println("hello iam test1");
    }

    @Ignore("i want to skip this") //junit 5 @Disabled
    @Test
    public void test2(){
        System.out.println("hello iam test2");
        Assert.assertEquals(true,false);
    }

    @Test(timeout = 1000)
    public void test0(){
        System.out.println("hello iam test0");

        Assert.assertTrue(true); //junit 5: Assertions.assertTrue(true);
    }

    @Before //junit5 : BeforeEach
    public void demoBefore(){
        System.out.println("I am running before");
    }
    @After //junit5 : AfterEach
    public void demoAfter(){
        System.out.println("I am running after");
    }

    @BeforeClass //junit5: BeforeAll
    public static void demoBeforeAll(){
        System.out.println("I am running before running all");
    }

    @AfterClass //junit5: AfterAll
    public static void demoAfterAll(){
        System.out.println("I am running after running all");
    }

}
