package nk;

public class Nkk {

	public static void main(String[] args) {
		class Navigations {

			public static void main(String[] args) throws Exception {
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				Thread.sleep(2000);
				driver.navigate().to("https://www.facebook.com");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().refresh();

				
			}

		}
	}

}
