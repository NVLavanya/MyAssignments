package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmlink = driver.findElement(By.linkText("CRM/SFA"));
		crmlink.click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("NVLavnya");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Venkateswarlu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("jill");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jack");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("I am learning selenium");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nvl@gamil.com");
		WebElement state =  driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj = new Select(state);
		obj.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Page title is    "+ driver.getTitle());
		//driver.close();	
			
	}

}
