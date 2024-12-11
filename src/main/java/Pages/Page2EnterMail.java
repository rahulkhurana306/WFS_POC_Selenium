package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public final class Page2EnterMail {
	
	 WebDriver driver;

	    @FindBy(id = "emailInput") // Unique element to identify Page 2
	    WebElement mailIdIdentifier;

	    public Page2EnterMail(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public boolean isDisplayed() {
	        return mailIdIdentifier.isDisplayed();
	    }

	    public void performAction() {
	        System.out.println("Performing action: Entering Mail ID.");
	        mailIdIdentifier.sendKeys("rahul.khurana@soprabanking.com");
	        driver.findElement(By.xpath("//*[@id=\"apak-login-form\"]/div/div[1]/div/div[3]/div/button")).click();
	    }

}
