package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\mahesh mane\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/electronics-big-billion-days-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_28bf979b-4336-44fe-b8ae-8289303cc458_1_9LC8G3VNYH8P_MC.3JCSYRATTA23&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics_3JCSYRATTA23&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=3JCSYRATTA23");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Actions act=new Actions(driver);
		
		//move to element
		act.moveToElement(driver.findElement(By.xpath("//span[@class=\"_2I9KP_\"]//following::span[2][text()=\"Men\"]"))).build().perform();
	//click on men butten
		act.click(driver.findElement(By.xpath("//a[@title=\"T-Shirts\"]"))).click().build().perform();
		
		act.click(driver.findElement(By.xpath("//img[@src=\"https://rukminim1.flixcart.com/image/495/594/ku1k4280/t-shirt/n/s/7/m-lrkccslf045002-louis-philippe-jeans-original-imag799bw7usarq9.jpeg?q=50\"]"))).click().build().perform();
		
		
		
		String parentwindow=driver.getWindowHandle();
		Set<String> MultipleWindows=driver.getWindowHandles();
		
		Iterator<String> it=MultipleWindows.iterator();
		while(it.hasNext())
		{
			String childwindow=it.next();
			if(!parentwindow.equalsIgnoreCase(childwindow)) {
				
				driver.switchTo().window(childwindow);
				WebElement Xl=driver.findElement(By.xpath("//a[text()=\"XL\"]"));
				act.click(Xl).build().perform();
				
			}
		}
		
		
		
		
		
	}

}
