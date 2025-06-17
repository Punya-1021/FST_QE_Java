package Activities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ExtraExample1 {
	public static void main(String[] args) {
		
		
		//Initialize driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//initialize Action object
		Actions builder = new Actions(driver);
		
		//open the browser or page
		driver.get(" https://training-support.net/webelements/tables");
		
		//to maximize the window size
		driver.manage().window().maximize();
		
		//find the no of rows and columns in the table and print them
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("no of rows" + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("no of cols" + cols.size());
		
		//find and click the add row button
		WebElement addbutton = driver.findElement(By.xpath("//button[text()='Add Row +']"));
		builder.click(addbutton).build().perform();
		
		//find the newly added row and add the following data
		String[] dataToAdd = {"10", "hover car racer", "matthew Reilly", "0908753269", "$7.99"};
		for(int i=0; i<dataToAdd.length; i++) {
			By lastRowCells = By.xpath("//table/tbody/tr[last()]/td["+(i+1)+"]");
			driver.findElement(lastRowCells).clear();
			driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
			
		}
		//print the data from the new row
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
		
		
		//driver.quit();
		
	}

}
