package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3SelectTestAnalyst {
	  WebDriver driver;

	    @FindBy(css = "span[class='MuiButtonBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium PrivateSwitchBase-root MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium MuiCheckbox-root MuiCheckbox-colorPrimary MuiCheckbox-sizeMedium css-muklqj'] input[type='checkbox']") 
	    // Unique element to identify Page 3
	    WebElement testAnalystIdentifier;

	    
	    
	    
	    public Page3SelectTestAnalyst(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public boolean isDisplayed() {
	        return testAnalystIdentifier.isDisplayed();
	    }

	    public void performAction() {
	        System.out.println("Performing action: Selecting Test Analyst.");
	        testAnalystIdentifier.click();
	        driver.findElement(By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary.MuiButton-sizeMedium.MuiButton-containedSizeMedium.css-1imsr75")).click();

	    }

}

