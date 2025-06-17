package Activities;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.Color;


	public class TestActivity5 {
		
			public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();//it is class name -- FirefoxDriver (but the driver name is "geckodriver"
				
				// Open the browser or page
				driver.get("https://training-support.net/webelements/dynamic-controls");//put link of that browser
				
				// Page interaction
				//Print the page title
				System.out.println(driver.getTitle());
				
				WebElement checkBox = driver.findElement(By.id("checkbox"));
			   System.out.println(checkBox.isDisplayed());
			   
			   driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
			   System.out.println(checkBox.isDisplayed());
			   
				driver.quit();

			}

			}








