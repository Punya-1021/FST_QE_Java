package Activities;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class TestActivity9 {
			public static void main(String[] args) {
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
					 
				Actions builder = new Actions(driver);
				
				
				driver.get(" https://training-support.net/webelements/keyboard-events");//put link of that browser
			
				System.out.println(driver.getTitle());
				
				//Type some texts
				builder.sendKeys("This is some text with 123 and !@").build().perform();
			
				
				System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
				

				driver.quit();

			

	}
	}



