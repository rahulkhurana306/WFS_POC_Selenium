package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1LoginSopra {
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(id = "mainForm:selectInternalIssuerAndRedirect") // Unique element to identify Page 1
    WebElement loginSopraIdentifier;

    public Page1LoginSopra(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isDisplayed() {
        return loginSopraIdentifier.isDisplayed();
    }

    public void performAction() {
        System.out.println("Performing action: Selecting Login Sopra.");
       // loginSopraIdentifier.click();
//        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainForm:selectInternalIssuerAndRedirect")));
//        
//        usernameField.click();
        driver.findElement(By.id("mainForm:selectInternalIssuerAndRedirect")).click();
        System.out.println("Performed action: Selecting Login Sopra.");
    }
    

}
