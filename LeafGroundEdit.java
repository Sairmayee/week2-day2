package week2.daytwo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("test@test.com");

		driver.findElement(By.xpath("//div[@class='example'][2]//input")).sendKeys("adding text" + Keys.ENTER);
		

		System.out.println(driver.findElement(By.xpath("//div[@class='example'][3]//input")).getAttribute("value") + " is the default text");
		
		driver.findElement(By.xpath("//div[@class='example'][4]//input")).clear();
		
		boolean enabled = driver.findElement(By.xpath("//div[@class='example'][5]//input")).isEnabled();
		if (enabled == false) System.out.println("Edit field is disabled");
		else { System.out.println("Edit field is enabled");}

		

	}

}
