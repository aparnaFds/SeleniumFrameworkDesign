package testGroup;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.SearchProductPage;
import testComponents.BaseClass;

public class AmazonLoginTest2 extends BaseClass {

//	public static void main(String[] args) throws InterruptedException {

	@Test
	public void amazonLogin() throws IOException, InterruptedException {
		String productName = "Mobile";

		// launchApplication();
		driver.get("http://www.amazon.in");
		LandingPage landingPage = new LandingPage(driver);
		try {
			landingPage.loginFun("acharya.aparna@gmail.com", "Godbless1!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SearchProductPage searchProd = new SearchProductPage(driver);
		try {
			searchProd.searchFun(productName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = { "amazonLogin" })
	public void displayResults() {
		String resultTitle = driver.getTitle();
//		System.out.println("Results page title = "+resultTitle);
		Assert.assertEquals(resultTitle, "Amazon.in : Mobile");
	}

}
