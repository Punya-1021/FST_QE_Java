package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class TestActivity10 {
			public static void main(String[] args) {
				WebDriver driver = new FirefoxDriver();
				
				driver.manage().window().maximize();
					 
				Actions builder = new Actions(driver);
				
				
				driver.get("https://training-support.net/webelements/drag-drop");//put link of that browser
			
				System.out.println(driver.getTitle());
				
				//find all the web elements
				WebElement ball = driver.findElement(By.id("ball"));
				WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
				WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
				
				builder.dragAndDrop(ball, dropzone1).build().perform();
				System.out.println(dropzone1.findElement(By.className("dropzone-text")).getText());//find element get through web element also not only through driver .
				//(so that it will not search through entire page rather it will search from its parent )
				
				//builder.dragAndDrop(ball, dropzone2).build().perform();
				builder.clickAndHold(ball).moveToElement(dropzone2).release().build().perform();
				System.out.println(dropzone2.getText());
				
				driver.quit();



}
	}
