import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String userProfile = "C:\\Users\\rkhurana\\AppData\\Local\\Google\\Chrome\\User Data";

	        // Configure ChromeOptions to use the existing user profile
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("user-data-dir=" + userProfile);  // Path to the user profile directory
	        options.addArguments("profile-directory=Default");
	        
	        

		WebDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://c110-iat.apak.delivery/WFS/creditLimitDetails.faces");


	}

}
