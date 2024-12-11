package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page5HomePage {
	 WebDriver driver;

	    @FindBy(id = "portal_home") // Unique element to identify Home Page
	    WebElement homePageIdentifier;
	    
	    @FindBy(id = "dealing_company_selection") 
	    WebElement dealingCompanySelection;
	    
	    
	    @FindBy(id = "companyNameColumn") 
	    WebElement companyName;
	    
	    @FindBy(id = "mainForm:selectOrganisationButton") 
	    WebElement selectButton;
	    
	  
	    
	    @FindBy(xpath = "//tr[@rowcount='0']") 
	    WebElement rowOneDC;
	    
	    @FindBy(xpath = "//*[@id=\"topnav\"]/li[8]/a") 
	    WebElement loanManagement; 
	    
	    
	    
	    
	    @FindBy(id = "create_loan") 
	    WebElement createLoan;
	    
	    

	    public Page5HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public boolean isDisplayed() {
	        return homePageIdentifier.isDisplayed();
	    }

	    public void performAction() {
	        System.out.println("You have reached the Home Page. No further actions required.");
	    }
	    
	    
	   public void selectDealingCompany() throws InterruptedException
	   {
		   dealingCompanySelection.click();
		   Thread.sleep(5000);
		  // companyName.click();
		   rowOneDC.click();
		   Thread.sleep(5000);
		   selectButton.click();
		   
		   
	   }
	   
	   public void hoverLoanManagement()
	   {
		   Actions actions = new Actions(driver);

           // Perform the hover action
           actions.moveToElement(loanManagement).perform();
	   }
	   
	   
	   public void openCreateLoan()
	   {
		   
		   createLoan.click();
	   }

	   
	   
	   
	    
}
