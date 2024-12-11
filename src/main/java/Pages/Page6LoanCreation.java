package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6LoanCreation {
	
	WebDriver driver;
	
	public Page6LoanCreation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	   @FindBy(id = "organisationTable_idFilter") 
	    WebElement refID;
	   
	   
	   @FindBy(id = "organisationTable_idFilter_Input") 
	    WebElement refIDInput;
	   
   
	   @FindBy(id = "mainForm:organisationTable_apakTableSearchButton") 
	    WebElement searchButton;
	
	 
	   
	   @FindBy(xpath = "//a[@title='APP000578']") 
	    WebElement dealerValue;
	   
	   
	   
	   @FindBy(id = "mainForm:selectOrganisationButton") 
	    WebElement selectDealerButton;
	
	   
	   
	   public void searchDealer()
	   {
		   refID.click();
		   refIDInput.sendKeys("APP000578"+ Keys.TAB);
		   searchButton.click();
		   
		   
	   }
	   
	   public void selectDealer() throws InterruptedException
	   {
		   dealerValue.click();
		   Thread.sleep(3000);
		   selectDealerButton.click();
		   
	   }
	

}
