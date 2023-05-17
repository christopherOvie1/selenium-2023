import org.junit.Before;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser {
	
	
	public WebDriver driver;
	
	@Before
	public void  startBrowser() throws InterruptedException {
	
		driver=	WebDriverManager.chromedriver().create(); //setup is void  wdm
		driver.manage().window().maximize();
		driver.navigate().to("https://thetestingworld.com/testings");
		

	}
	
	@After
	public void closeBrowser() {
		driver.close();
	}
}
