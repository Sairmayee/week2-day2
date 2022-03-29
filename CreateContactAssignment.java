package week2.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");

	
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();

		
		driver.findElement(By.linkText("CRM/SFA")).click();

		
		driver.findElement(By.linkText("Contacts")).click();

		
		driver.findElement(By.linkText("Create Contact")).click();
		// Enter mandatory fields
		driver.findElement(By.id("firstNameField")).sendKeys("Sairmayee");

		
		driver.findElement(By.id("lastNameField")).sendKeys("Kodela");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("S_Local");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K_Local");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Created as part of assignment");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("test@test.com");
		WebElement eleState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleState);
		dd.selectByVisibleText("New York");

		
		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note to be entered as part of Assignment");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
