package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lavi");
		driver.findElement(By.name("lastname")).sendKeys("NV");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]")).sendKeys("9884574525");
		driver.findElement(By.id("password_step_input")).sendKeys("Lav@123");
		WebElement date = driver.findElement(By.id("day"));
		Select dateSelect = new Select(date);
		dateSelect.selectByValue("16");
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		monthSelect.selectByIndex(3);
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText("1991");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	}

}
