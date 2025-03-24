package fullyautomatedwebsite;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {
	 private WebDriver driver;
	 
	    private By NameonCard = By.xpath("//input[@name='name_on_card']");
	    private By CardNumber = By.xpath("//input[@name='card_number']");
	    private By CVC= By.xpath("//input[@placeholder='ex. 311']");
	    private By ExpMonth = By.xpath("//input[@placeholder='MM']");
	    private By ExpYear = By.xpath("//input[@placeholder='YYYY']");
	  private By PlaceOrder = By.xpath("//button[@id='submit']");
	    
	    public Payment(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    public void cardinfo( String cardname,String cardnum, String cardcvc, String cardmonth, String cardyear)  {
	        
	    	driver.findElement(NameonCard).sendKeys(cardname);
	        driver.findElement(CardNumber).sendKeys(cardnum);
	        driver.findElement(CVC).sendKeys(cardcvc);
	        driver.findElement(ExpMonth).sendKeys(cardmonth);
	        driver.findElement(ExpYear).sendKeys(cardyear);
	    //    driver.findElement(PlaceOrder).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll to 'Men' before clicking
	        WebElement placed = driver.findElement(PlaceOrder);
	        js.executeScript("arguments[0].scrollIntoView(true);", placed);
	        // Wait for visibility
	        placed.click();
	    }
	    
}
