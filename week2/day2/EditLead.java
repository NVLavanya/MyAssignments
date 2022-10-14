package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Lavanya']")).click();
		System.out.println("Title of the page is  "+ driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		WebElement upCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		upCompany.clear();
		upCompany.sendKeys("CTS");
		WebElement updateLead = driver.findElement(By.className("smallSubmit"));
		updateLead.click();
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String actualValue = "CTS";
		System.out.println(updatedCompany);
		if(updatedCompany.contains(actualValue))
		System.out.println("Company Name is Updated");
		else
		System.out.println("Company Name is Not Updated");
		driver.close();
	}

}
