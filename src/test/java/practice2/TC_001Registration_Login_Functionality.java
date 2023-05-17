package practice2;

import org.junit.Before;
import org.junit.Test;
//import org.junit.Test;
import org.junit.Assert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_001Registration_Login_Functionality {

	//public WebDriver driver;
	String name ="chris",password="Father70";
	
	
		
		@Test
		public void test001() throws InterruptedException {
			driver.findElement(By.cssSelector("[class='tabs blue'] li:nth-child(2) label")).click();
			
			driver.findElement(By.name("_txtUserName")).sendKeys(name);
	
			driver.findElement(By.name("_txtPassword")).sendKeys(password);
			
			driver.findElement(By.cssSelector("[type='submit'][value='Login']")).click();


			
		boolean flag=	driver.findElement(By.cssSelector(".logo img")).isDisplayed();
		System.out.println(flag);
	Assert.assertTrue(flag);
	
	System.out.println(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]/a")).getText());
	Assert.assertTrue(driver.findElement(By.cssSelector("fieldset legend")).getText().contains("My Profile"));
driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]/a")).getText();
Assert.assertEquals("Welcome Mr. chris", driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]/a")).getText());
	
		
		
		
			
			
			
		}
		
	

	

}
