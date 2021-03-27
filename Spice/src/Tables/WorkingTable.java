package Tables;

import java.util.List;

//import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.testng.annotations.Test;

public class WorkingTable {
	public static WebDriver driver;
	@Test(priority=1)
	public void open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html");
		List<WebElement> t = driver.findElements(By.tagName("table"));
		System.out.println("no of tables:"+t.size());
	}
		@Test( priority=2)
		public void row() {
			WebElement row = driver.findElement(By.xpath("//table[@id='wb-auto-1']"));
			List<WebElement>TotalRowsList = row.findElements(By.tagName("tr"));
			System.out.println("no of rows:"+TotalRowsList);
	
			
		}
	

}
