package com.JenkiensDemo.dummy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class dummyOne {


public class NewTestStartedDummy {
  @Test
  public void TestClass() {
	  System.out.println("We are in Test");
	  Assert.assertTrue(true);
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
