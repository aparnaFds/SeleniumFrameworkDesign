package pageObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {

	WebDriver driver;

	public SearchProductPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;

//	driver.findElement(By.id("nav-search-submit-button")).click();
	@FindBy(id = "nav-search-submit-button")
	WebElement subBtn;
	


	public void searchFun(String prodName) throws InterruptedException {
		searchBox.sendKeys(prodName);
		subBtn.click();

	}

}
