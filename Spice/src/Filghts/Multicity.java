package Filghts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multicity {
	@Test
	public void login() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[3]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Ok")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Bathinda (BUP)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Delhi (DEL)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("20")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(1000);
		new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult"))).selectByIndex(2);
		Thread.sleep(1000);
		new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Child"))).selectByIndex(2);
		Thread.sleep(1000);
		new Select (driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Infant"))).selectByIndex(3);
		Thread.sleep(1000);
		new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"))).selectByIndex(4);
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[14]/span/input[1]")).click();
	}
	

}
