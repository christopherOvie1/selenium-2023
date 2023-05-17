package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//use obj internally
		//download latest gecko driver software.this talk to firefox 
		//stup non static mrethd..chromedriver)  static mrtd
		WebDriverManager.firefoxdriver().setup();  //setup is void  wdm
		
		//call static mtd using class name no need to create object
		///return object to webdrivermanager class
		//download latesr msedge  driver software and store in cache(ram)
		
		//belndgs to selenium
	ChromeDriver driver =new ChromeDriver();  //sws
	driver.navigate().to("https://automationexercise.com/");
	//java
	Thread.sleep(50000);
	driver.close();
		

	}

}
