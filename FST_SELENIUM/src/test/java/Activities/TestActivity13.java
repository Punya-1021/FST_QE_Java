package Activities;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

		public class TestActivity13 {
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
					
					//Get the title of the page and print it to the console.
					System.out.println(driver.getTitle());
					
					//Find the number of rows and columns in the table and print them.
					List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
					System.out.println("no of rows" + rows.size());
					
					//Find and print the Book Name in the 5th row.
					WebElement fifthrow = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
					System.out.println(fifthrow.getText());
					
					//Click the header of the Price column to sort it in ascending order.
					WebElement price = driver.findElement(By.xpath("//table/thead/tr/th[5]"));
					builder.click(price).build().perform();
					
					//Find and print the Book Name in the 5th row again .
					WebElement fifthrow1 = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));		
					System.out.println(fifthrow1.getText());
							
				
					driver.quit();
}
		}
		
