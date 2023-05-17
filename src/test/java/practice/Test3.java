package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		//use obj internally
		//download latest gecko driver software.this talk to firefox 
		//stup non static mrethd..chromedriver)  static mrtd
		WebDriverManager.firefoxdriver().setup();  //setup is void
		
		//call static mtd using class name 
		///return object to webdrivermanager class
		//download gecko driver software and store in cache(ram)
		
		//belndgs to selenium
	ChromeDriver driver =new ChromeDriver();  //1.create an object to a class using constructor mtd
	//if no constructor mrd jre uses default constructor
	//2.create an object to a class using some other code which reurns object
	driver.navigate().to("https://automationexercise.com/");
	//java
	Thread.sleep(50000);
	driver.close();
		

	}

}
