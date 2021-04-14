package com.dummy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dummyOne {


public class NewTest {
  @Test
  public void TestClass() {
	  System.out.println("We are in Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("We are in Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("We are in After Method");

  }


}}
