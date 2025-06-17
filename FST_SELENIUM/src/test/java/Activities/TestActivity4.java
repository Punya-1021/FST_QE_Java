package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;


public class TestActivity4 {
	
		public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();//it is class name -- FirefoxDriver (but the driver name is "geckodriver"
			
			// Open the browser or page
			driver.get("https://training-support.net/webelements/target-practice");//put link of that browser
			
			// Page interaction
			//Print the page title
			System.out.println(driver.getTitle());
			
			
			String message = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText(); 
			System.out.println(message);
		    
//		   String third_heading = driver.findElement(By.xpath("//h3[contains(text(), '#3')]");
//		    	    System.out.println("Third heading text is: ", third_heading.text);

		    
		    //System.out.println(driver.findElement(By.xpath("//h5[text(), 'Heading #5']")).getDomAttribute("class"));
//		    Color headingColor = Color.fromString(driver.findElement(By.xpath("//h5[text(), 'Heading #5']")).getCssValue("color"));
//		    System.out.println(headingColor.asHex());
			
			
			//Find the 5th header and print its color
			Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath( "//h5[contains(text(), '#5')]" )).getCssValue( "color" )); 
			System.out.println( "Color as RGB: " + fifthHeaderColor.asRgb()); 
			System.out.println( "Color as hexcode: " + fifthHeaderColor.asHex());

		    
		    System.out.println(driver.findElement(By.cssSelector("button.bg-purple-200")).getCssValue("color"));

		    
		    System.out.println(driver.findElement(By.cssSelector("button.bg-slate-200")).getText());

		    
		    
			//Close the browser
			driver.quit();
		}

		}





