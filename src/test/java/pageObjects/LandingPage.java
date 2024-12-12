package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	WebElement signInLink = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement signInLink;

//	WebElement id = driver.findElement(By.id("ap_email"));
	@FindBy(id = "ap_email")
	WebElement id;

//	WebElement SignInBtn = driver.findElement(By.className("a-button-input"));
	@FindBy(className = "a-button-input")
	WebElement SignInBtn;

//	WebElement password = driver.findElement(By.id("ap_password"));
	@FindBy(id = "ap_password")
	WebElement password;

//	WebElement submitBtn = driver.findElement(By.id("signInSubmit"));
	@FindBy(id = "signInSubmit")
	WebElement submitBtn;
	
	public void loginFun(String email, String passwordEle) throws InterruptedException {
		signInLink.click();
		id.sendKeys(email);
//		Thread.sleep(1000);
		SignInBtn.click();
		password.sendKeys(passwordEle);
		submitBtn.click();
		
	}

}
