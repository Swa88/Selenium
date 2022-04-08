package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;


public class Action_Class {

	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\chromedriver.exe"); 
		   WebDriver driver = new ChromeDriver(); 
		  driver.get("file:///D:/Website/Offline%20Website%20_%20new/index.html"); 
		 		

		 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
			
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.tagName("button")).click();
			
			//Action class...
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Actions action =new Actions(driver);
			
		action.moveToElement(driver.findElement(By.xpath("//a[@href='users.html']"))).click();
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}