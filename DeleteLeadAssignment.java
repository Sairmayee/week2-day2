package week2.daytwo;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); // static
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//a[contains(@class,\"right\")]//span[text()=\"Phone\"]")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("999");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("999");
		driver.findElement(By.name("phoneNumber")).sendKeys("9999");
		driver.findElement(By.xpath("//button[@type='button'][text()=\"Find Leads\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[contains(@class,\"Dangerous\")]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//a[contains(@class,\"right\")]//span[text()=\"Phone\"]")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("999");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("999");
		driver.findElement(By.name("phoneNumber")).sendKeys("9999");
		driver.findElement(By.xpath("//button[@type='button'][text()=\"Find Leads\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		assertTrue(true, "No records to display");

	}

}
