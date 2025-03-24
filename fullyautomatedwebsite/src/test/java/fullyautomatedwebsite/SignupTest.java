package fullyautomatedwebsite;
import java.awt.AWTException;

import org.testng.annotations.Test;

public class SignupTest extends BaseTest {
	   @Test
	    public void testSignupProcess() throws InterruptedException, AWTException {
	        HomePage homePage = new HomePage(driver);
	        homePage.clickSignupLogin();

	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterSignupDetails("Vishal Gupta", "vishalgupta98674@gmail.com");

	        SignupPage signupPage = new SignupPage(driver);
	        signupPage.fillAccountInfo("vishal1234", "10", "March", "1995");
	        
	        
	        BuyProduct buyproduct = new BuyProduct(driver);
	        buyproduct.product1(3);
	        
	       
	        Payment payment = new Payment(driver);
	        payment.cardinfo("Vishal","2342 6574 4352","756","04","2027");

	        System.out.println("Order Placed  Successfully!");
	    }
	   
}
