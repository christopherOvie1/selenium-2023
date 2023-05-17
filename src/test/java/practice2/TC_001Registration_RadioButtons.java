package practice2;

import org.junit.Before;
import org.junit.Test;
//import org.junit.Test;
import org.junit.Assert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_001Registration_RadioButtons {

	public WebDriver driver;
	String name ="chris",password="Father70";
	

		
		@Test
		public void test001() throws InterruptedException {
			
		//String css= "[type=' +"value"+ ']";
		//[type='+"radio"+'] 
			driver.findElement(By.name("fld_username")).sendKeys(name);
			driver.findElement(By.name("fld_password")).sendKeys(password);
			driver.findElement(By.cssSelector("[type='radio'][value='home']")).click();	
			
			
		}
		
		

	

}
