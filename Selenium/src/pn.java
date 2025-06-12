import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class pn {
   static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
	}

	@Test
	void idnameclassname() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000); 
		driver.findElement(By.id("user_login")).sendKeys("pn");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("123");


	}
	@Test
	void cssSelector() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#user_login")).sendKeys("kp");
		Thread.sleep(2000)
	}
}
