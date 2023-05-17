package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) {
		//create object to a class using some other code
		WebDriver driver = WebDriverManager.chromedriver().create();
		//driver related to WebDriver  not WebDriverManager
		
		//create an object to class using some other code which returns object to that class
		//WebDriverManager related to WebDriverManager jars 
		//WebDriver related to WebDriver jars
		//using create browser closes autiomatically   create returns an object to webdriver manager class
		//creating broser o  gradual move
		//1.create an object to a class using constructor mtd
		//if no constructor mrd jre uses default constructor
		//2.create an object to a class using some other code which reurns object
		//to call static mtd in a jar file use class name
		//to call non static mtd use object of the class
		driver.get("");
		RemoteWebDriver x;   //class  instance

	}
	//types of classses in jdk and in jars
	//1instance class simply call class have properties,construtor and general methods
	//create an object or instance to the class to access properties and general methods
	//to create object/instance to a cllass using constructor mtd or other code , to access propeties and general 
	//method
	
	//2 static class  (having all static properties and all general mtds
	//not having or requiring constructor method) call static mtd using ckass name
	
	///3 if some are static and some non static cal it non static or instatic
	//but non static members call using  instance
	
	//4  having general non static methods without bodies
	//other instance class provide bodies to method of interface
	
	//other instance class is called as concrete class.
	//create object to interface using concrete class constructor or other code which returns object  =WebDriver
	//interfacface has no class

}
