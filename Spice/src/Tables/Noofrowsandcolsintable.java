package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noofrowsandcolsintable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html#wb-auto-1");
        driver.manage().window().maximize();
        WebElement table=driver.findElement(By.xpath("//table[@id='wb-auto-1']"));
        List<WebElement> rows=table.findElements(By.tagName("tr"));
        System.out.println(rows.size());
        List<WebElement> columns=rows.get(1).findElements(By.tagName("td"));
        System.out.println("number of columns in first row :: " + columns.size());
        driver.quit();

	}

}
