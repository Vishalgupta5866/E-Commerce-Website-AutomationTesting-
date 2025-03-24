package fullyautomatedwebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProduct {
	WebDriver driver;
	private By Men  = By.xpath("//a[normalize-space()='Men']");
//	private By TShirt = By.xpath("a[href='/category_products/3']");
	private By ViewProduct = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
	private By Quantity = By.xpath("//input[@id='quantity']");
	private By AddtoCart = By.xpath("//button[@type='button']");
	private By CheckOut = By.xpath("//a[@class='btn btn-default check_out']");
	//private By AddtoCart = By.xpath("//button[@type='button']");
	//private By AddtoCart = By.xpath("//button[@type='button']");
	//private By AddtoCart = By.xpath("//button[@type='button']");
	//private By PlaceOrder = By.linkText("Place Order");
	
	 
		
	 public BuyProduct(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 
	 public void product1(int qua) throws InterruptedException
	 {
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll to 'Men' before clicking
	        WebElement menElement = driver.findElement(Men);
	        js.executeScript("arguments[0].scrollIntoView(true);", menElement);
	        // Wait for visibility
	        menElement.click();
	        Thread.sleep(2000);
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement productLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/category_products/3']")));
	        productLink.click();

	        // Scroll and click on 'View Product'
	        WebElement viewProductElement = driver.findElement(ViewProduct);
	        js.executeScript("arguments[0].scrollIntoView(true);", viewProductElement);
	      
	        viewProductElement.click();

	        // Scroll to Quantity input, clear and enter quantity
	        WebElement quantityElement = driver.findElement(Quantity);
	        js.executeScript("arguments[0].scrollIntoView(true);", quantityElement);
	      
	        quantityElement.clear();
	        quantityElement.sendKeys(String.valueOf(qua));
	        
	        driver.findElement(AddtoCart).click();
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[normalize-space()='View Cart']")));
	        element.click();	
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(CheckOut).click();
	       // driver.findElement(PlaceOrder).click();
	        WebElement placeOrderButton = driver.findElement(By.linkText("Place Order"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeOrderButton);
	        
	        
	 }
}
