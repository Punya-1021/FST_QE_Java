package Activities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActivity14 {
	public static void main(String[] args) {
		
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//initialize Action object
		Actions builder = new Actions(driver);
		
		//open the browser or page
		driver.get("https://training-support.net/webelements/tables");
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		//Get the title of the page and print it to the console.
		System.out.println(driver.getTitle());
		
		//Find the number of rows and columns in the table and print them.
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("no of rows" + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("no of rows" + cols.size());
		
		//find and print all the cell values in the third row of the table
		List<WebElement> thirdrow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
		
		//find and print the cell value of second row second column

		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
		
		//driver.quit();
	}

	
}
