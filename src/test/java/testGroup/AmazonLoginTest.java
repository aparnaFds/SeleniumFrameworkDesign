package testGroup;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.SearchProductPage;
import testComponents.BaseClass;
import testComponents.Retry;

public class AmazonLoginTest extends BaseClass {

//	public static void main(String[] args) throws InterruptedException {

	@Test(dataProvider = "getData", groups={"ProductSearch"})
	public void amazonLogin(String email, String pass, String prod) throws IOException, InterruptedException {
		// String productName = "Mobile";

		// launchApplication();
		driver.get("http://www.amazon.in");
		LandingPage landingPage = new LandingPage(driver);
		try {
			landingPage.loginFun(email, pass);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SearchProductPage searchProd = new SearchProductPage(driver);
		try {
			searchProd.searchFun(prod);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = { "amazonLogin" }, groups={"ProductSearch"}, retryAnalyzer=Retry.class)
	public void displayResults() {
		String resultTitle = driver.getTitle();
//		System.out.println("Results page title = " + resultTitle);
		AssertJUnit.assertEquals(resultTitle, "Amazon.in : Mobile");
	}

	@DataProvider
	public Object[][] getData() {

		String user = "acharya.aparna@gmail.com";
		String pwd = "Godbless1!";
		String product = "Mobile";
		return new Object[][] { { user, pwd, product } };

	}

}
