package fullyautomatedwebsite;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	 protected WebDriver driver;

	    @BeforeClass
	    public void setup() {
	   
	    	ChromeOptions options = new ChromeOptions();

	    	  Map<String, Object> prefs = new HashMap<>();
	          prefs.put("autofill.profile_enabled", false); // Disable address autofill
	          prefs.put("credentials_enable_service", false); // Disable password manager
	          prefs.put("profile.password_manager_enabled", false);
	          options.setExperimentalOption("prefs", prefs);

	          // Disable popups and automation extension
	          options.addArguments("--disable-popup-blocking");
	          options.setExperimentalOption("useAutomationExtension", false);
	        driver = new ChromeDriver(options);
	    	
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.automationexercise.com/");
	    }

	    @AfterClass
	  public void teardown() throws InterruptedException {
	    	Thread.sleep(4000);
	     driver.close();
	    }

}
