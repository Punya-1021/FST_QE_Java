package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestActivity16 {
	public static void main(String[] args) {
			 WebDriver driver = new FirefoxDriver();
			
			 driver.manage().window().maximize();
			
			
			driver.get("https://training-support.net/webelements/selects");
			System.out.println(driver.getTitle());
			
			Select dropdown = new Select(driver.findElement(By.cssSelector("select.h-10")));

			
			dropdown.selectByVisibleText("One");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			dropdown.selectByIndex(2);
			System.out.println(dropdown.getFirstSelectedOption().getText());

			dropdown.selectByValue("three");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			System.out.println("All available options : ");
			for(WebElement option : dropdown.getOptions())
			{
				System.out.println(option.getText());
			}

			driver.quit();
				
	}

}
