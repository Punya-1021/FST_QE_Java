# FST_QE_Java

This project is for QE training



Chrome browser : chromedriver(driver name)
Edge Browser : edgebrowser
Firefox Browser : geckodriver


/html/body/div/main/div/div/div/div/div[2]/form/label[1]

//*[@id="password"]

//*[@id="username"]


// Store the select and make a new select object
WebElement dropdown = driver.findElement(By.tagName("select"));
Select select = new Select(dropdown);

// Get all the options inside the select as a list
List<WebElement> options = select.getOptions();

// Select the third option based on Index
select.selectByIndex(2)

// Selecting the fourth option based on it's value
select.selectByValue("four")

// Selecting the third option based on visible text
select.selectByVisibleText("Option 3")









// Store the select and make a new select object
WebElement dropdown = driver.findElement(By.tagName("select"));
Select select = new Select(dropdown);

// Get all the options inside the select as a list
List<WebElement> options = select.getOptions();

/*
 * Selecting and Deselecting Options With Index
 */

// Selecting the 3rd and 4th Options
select.selectByIndex(2);
select.selectByIndex(3);

// Deselecting the 3rd Option
select.deselectByIndex(2);





// Store the select and make a new select object
WebElement dropdown = driver.findElement(By.tagName("select"));
Select select = new Select(dropdown);

// Get all the options inside the select as a list
List<WebElement> options = select.getOptions();

/*
 * Getting ALL Selected Options
 */

List<WebElement> allSelected = select.getAllSelectedOptions();

/*
 * Getting The First Selected Option
 * According to the DOM
 */
 
WebElement firstOption = select.getFirstSelectedOption();










