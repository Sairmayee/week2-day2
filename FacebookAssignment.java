package week2.daytwo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//form[contains(@data-testid,'royal_login')]//a[contains(@data-testid,'open-registration')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("First Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TestL");
		driver.findElement(By.xpath("//div[@id='reg_form_box']//div/input[contains(@name,'email')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//div[@id='reg_form_box']//div/input[contains(@name,'confirm')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("testing");
		
		WebElement eleDay = driver.findElement(By.id("day"));
		WebElement eleMonth = driver.findElement(By.id("month"));
		WebElement eleYear = driver.findElement(By.id("year"));
		
		Select dd_day = new Select(eleDay);
		Select dd_month = new Select(eleMonth);
		Select dd_year = new Select(eleYear);
		dd_day.selectByValue("15");
		dd_month.selectByVisibleText("Jun");
		dd_year.selectByValue("1983");
		
		driver.findElement(By.xpath("//form[@id='reg']//div/div[7]//input[@value='1']")).click();
		
		

	}

}
