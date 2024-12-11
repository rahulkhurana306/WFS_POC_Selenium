package Pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Page4SelectOrganisation {

	
	 WebDriver driver;

	    @FindBy(id = "mainForm:SSO_USER_INPUT") // Unique element to identify Page 4
	    WebElement organisationIdentifier;

	    public Page4SelectOrganisation(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public boolean isDisplayed() {
	        return organisationIdentifier.isDisplayed();
	    }

	    public void performAction() {
	        System.out.println("Performing action: Selecting Organisation.");
	        //organisationIdentifier.click();
	        Select select = new Select(organisationIdentifier);
	        select.selectByValue("Instance ID: *test* Dealing Company: PFC Organisation: PFC Department: PFCDEPT Visibility Group: null Tenant Id: c110");
	        driver.findElement(By.id("mainForm:continueLoginButton")).click();

	        
	    }
	    
}


