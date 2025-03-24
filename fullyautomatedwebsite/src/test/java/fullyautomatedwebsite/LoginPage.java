package fullyautomatedwebsite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	 private WebDriver driver;
	    private By nameField = By.name("name");
	    private By emailField = By.xpath("//input[@data-qa='signup-email']");
	    private By signupButton = By.xpath("//button[@data-qa='signup-button']");

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterSignupDetails(String name, String email) {
	        driver.findElement(nameField).sendKeys(name);
	        driver.findElement(emailField).sendKeys(email);
	        driver.findElement(signupButton).click();
}
}

