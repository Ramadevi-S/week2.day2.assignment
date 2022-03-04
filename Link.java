package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		WebElement linkValue = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String value = linkValue.getAttribute("href");
		System.out.println(value);
		Thread.sleep(2000);
		WebElement linkValue1 = driver.findElement(By.linkText("Verify am I broken?"));
		String value1 = linkValue1.getAttribute("href");
		System.out.println(value1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='../home.html'])[3]")).click();


	}

}
