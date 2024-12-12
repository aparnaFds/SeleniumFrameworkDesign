package testGroup;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;

public class StandaloneTestAmazon {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.rahulshettyacademy.com/client");
		 * driver.findElement(By.id("userEmail")).sendKeys("acharya.aparna@gmail.com");
		 * driver.findElement(By.id("userPassword")).sendKeys("Password123");
		 * driver.findElement(By.id("login")).click();
		 * 
		 * int cards = driver.findElements(By.className(".mb-3")).size();
		 * System.out.println(cards); List<WebElement> products =
		 * driver.findElements(By.className(".mb-3")); WebElement prod =
		 * products.stream().filter(product-> products.findElement((
		 * By.className("b")).getText().equals("ZARA COAT 3")).findFirst().orElese(null)
		 * );
		 */

		driver.get("http://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("acharya.aparna@gmail.com");

		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Godbless1!");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
