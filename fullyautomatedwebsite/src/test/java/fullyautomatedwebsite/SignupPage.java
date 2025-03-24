package fullyautomatedwebsite;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SignupPage {
	 private WebDriver driver;
	 
	    private By titleMr = By.id("id_gender1");
	    private By passwordField = By.id("password");
	    private By dayDropdown = By.id("days");
	    private By monthDropdown = By.id("months");
	    private By yearDropdown = By.id("years");
	    private By FirstName = By.id("first_name");
	    private By LastName = By.id("last_name");
	    private By Company = By.id("company"); 
	    private By Address = By.id("address1");
	    private By State = By.id("state");
	    private By City = By.id("city");
	    private By Zipcode = By.id("zipcode");
	    private By MobileNumber = By.id("mobile_number");
	  //  private By Homepage =By.xpath("//a[normalize-space()='Home']");
	  
	 //   Alert alert = driver.switchTo().alert() ;
	   // By noThanksButton = By.xpath("//button[text()='No thanks']");
	 

		
	    
	    

	    public SignupPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void fillAccountInfo(String password, String day, String month, String year) throws InterruptedException, AWTException  {
	        driver.findElement(titleMr).click();
	        driver.findElement(passwordField).sendKeys(password);
	        driver.findElement(dayDropdown).sendKeys(day);
	        driver.findElement(monthDropdown).sendKeys(month);
	        driver.findElement(yearDropdown).sendKeys(year);
	        
	        driver.findElement(FirstName).sendKeys("Vishal");
	        driver.findElement(LastName).sendKeys("Gupta");
	        driver.findElement(Company ).sendKeys("student");
	        driver.findElement(Address).sendKeys("Bhayander east");
	        driver.findElement(State).sendKeys("Maharashtra");
	        driver.findElement(City).sendKeys("Mumbai");
	        driver.findElement(Zipcode ).sendKeys("401193");
	        driver.findElement(MobileNumber).sendKeys("8454971234");
	        
	        WebElement createAccountButton = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
		   
		    createAccountButton.click();
		
		    try {
		        // Locate the element again before clicking
		        WebElement homeButton = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		        homeButton.click();
		    } catch (StaleElementReferenceException e) {
		        // Re-locate the element in case of StaleElementReferenceException
		        WebElement homeButton = driver.findElement(By.xpath("//a[normalize-space()='Home']"));
	      
	       
		        homeButton.click();
		    }
		    
	    }
}
