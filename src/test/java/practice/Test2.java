package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		//use obj internally
		//stup non static mrethd..chromedriver)  static mrtd
		WebDriverManager.chromedriver().setup();  //setup is void
		
	ChromeDriver driver =new ChromeDriver();
	driver.navigate().to("https://automationexercise.com/");
	//java
	Thread.sleep(50000);
	driver.close();
		

	}

}
