package Filghts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Functionality {
	//public static  WebElement un;
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label")).click();
// new Select(	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1"))).selectByIndex(3);
		//Actions action = new Actions(driver);
	//WebElement	un=new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1"))).selectByIndex(3);
		//action.click().perform();
		//driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).
 driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1\"]")).sendKeys("Chennai (MAA)");
//		
	}

}
