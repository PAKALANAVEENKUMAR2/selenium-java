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

public class B_NewTest2 {
	WebDriver driver;

  @Test (priority=1)
  public void google () {
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void facebook () {
	  driver.get("https://www.facebook.com");

  }
 
  @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.in");

  }

  @Test
  public void amazon() {
	  driver.get("https://www.amazon.com");

  }

  @Test (priority=0)
  public void zudio() {
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
