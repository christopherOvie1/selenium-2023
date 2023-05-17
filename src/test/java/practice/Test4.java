package practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		//use obj internally
		//download latest gecko driver software.this talk to firefox 
		//stup non static mrethd..chromedriver)  static mrtd
		//WebDriverManager.chromedriver().driverVersion("112.0.").setup(); 
		//objects created intrnally
		//returns an object to same class twice
		//latest//  2   specific  version   3  browesr driver suitale to setup is void
		
		//call static mtd using class name no need to create object
		///return object to webdrivermanager class
		//download latesr msedge  driver software and store in cache(ram)
		
		
		WebDriverManager obj1= WebDriverManager.chromedriver();
		WebDriverManager obj2= obj1.driverVersion("112.0.");
		//3 objects used here
		obj2.setup();  //externally     3 gave non static nmtd  last return void and stop
		//1call a static mtd 2  return an onbject to webdrivermansger class 3 return an 
		//obj to webdriverman class 4 ret an obj to webdrivermanager class 5 returns void
		//belndgs to selenium
	ChromeDriver driver =new ChromeDriver();
	driver.navigate().to("https://automationexercise.com/");
	//java
	Thread.sleep(50000);
	driver.close();
		

	}

}
