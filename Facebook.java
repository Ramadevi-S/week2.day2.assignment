package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Rama");
		driver.findElement(By.xpath("(//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input)[1]")).sendKeys("arun");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Rama@123");
		WebElement elementDate = driver.findElement(By.id("day"));
		Select date = new Select(elementDate);
		date.selectByIndex(3);
		WebElement elementMonth = driver.findElement(By.id("month"));
		Select month = new Select(elementMonth);
		month.selectByIndex(8);
		WebElement elementYear = driver.findElement(By.id("year"));
		Select year = new Select(elementYear);
		year.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/input)[1]")).click();
		
		
		

	}

}
