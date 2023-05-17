package practice2;

import org.junit.Before;
import org.junit.Test;
//import org.junit.Test;
import org.junit.Assert; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_001Registration_Link_Functionality  {

	public WebDriver driver;
	String name ="chris",password="Father70";
	
	@Test
		public void test002() throws InterruptedException {
			
			driver.findElement(By.name("fld_username")).sendKeys(name);
			driver.findElement(By.name("fld_password")).sendKeys(password);
			driver.findElement(By.xpath("//a[text()='Read Detail']")).click();
			
			System.out.println(driver.findElement(By.cssSelector("#popup1 h2")).getText());
			Assert.assertEquals("Terms and Conditions", driver.findElement(By.cssSelector("#popup1 h2")).getText());
					
			
		}
}
