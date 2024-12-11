package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Page1LoginSopra;
import Pages.Page2EnterMail;
import Pages.Page3SelectTestAnalyst;
import Pages.Page4SelectOrganisation;
import Pages.Page5HomePage;
import Pages.Page6LoanCreation;

public class LoginTests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 String userProfile = "C:\\Users\\rkhurana\\AppData\\Local\\Google\\Chrome\\User Data";

	        // Configure ChromeOptions to use the existing user profile
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("user-data-dir=" + userProfile);  // Path to the user profile directory
	        options.addArguments("profile-directory=Default");
	        
	        

		WebDriver driver = new ChromeDriver(options);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://c110-iat.apak.delivery/WFS/creditLimitDetails.faces");
		
		
		Page1LoginSopra page1 = new Page1LoginSopra(driver);
        Page2EnterMail page2 = new Page2EnterMail(driver);
        Page3SelectTestAnalyst page3 = new Page3SelectTestAnalyst(driver);
        Page4SelectOrganisation page4 = new Page4SelectOrganisation(driver);
        Page5HomePage homePage = new Page5HomePage(driver);
        Page6LoanCreation loanCreation = new Page6LoanCreation(driver);

//        boolean homePageReached = false;
//
//        while (!homePageReached) {
//            if (page1.isDisplayed()) {
//                page1.performAction();
//            } else if (page2.isDisplayed()) {
//                page2.performAction();
//            } else if (page3.isDisplayed()) {
//                page3.performAction();
//            } else if (page4.isDisplayed()) {
//                page4.performAction();
//            } else if (homePage.isDisplayed()) {
//                homePage.performAction();
//                homePageReached = true;
//            }
//        }

      
       
                page1.performAction();
       
                page2.performAction();
       
                page3.performAction();
                page4.performAction();
                homePage.performAction();
                homePage.selectDealingCompany();
                homePage.hoverLoanManagement();
                homePage.openCreateLoan();
                loanCreation.searchDealer();
                
                
                
            
            //    driver.findElement(By.id("mainForm:logout")).click();
        
        
        // Close the browser
      // driver.quit();
        

	}

}
