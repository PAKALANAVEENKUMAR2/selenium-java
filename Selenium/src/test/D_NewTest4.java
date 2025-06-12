package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class D_NewTest4 {
	WebDriver driver;

  @Test (priority=1,enabled=true,description="verify google application")
  public void testone () {
	  driver.get("https://www.google.com");
  }
  
  @Test (description="verify facebook application")
  public void testtwo () {
	  driver.get("https://www.facebook.com");

  }
 
  @Test (description="verify techlearn application")
  public void testthree() {
	  driver.get("https://www.techlearn.in");

  }

  @Test (description="verify amazon application")
  public void testfour() {
	  driver.get("https://www.amazon.com");

  }

  @Test (priority=0,description="verify zudio application")
  public void testfive() {
	  driver.get("https://www.zudio.com");

  }

  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	 driver.quit();
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
