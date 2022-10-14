package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("nvl@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String captureFirstName = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
		System.out.println(captureFirstName);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String captureHeaderName = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		String ActualHeaderName = "Duplicate Lead";
		if(ActualHeaderName.equals(captureHeaderName))
			System.out.println("Title is Correct");
		else
			System.out.println("Title is Wrong");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String duplicateName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(duplicateName.equals(captureFirstName))
			System.out.println("Lead is Duplicated");	
		else
			System.out.println("Lead is Not Duplicated"); 
		//driver.close(); 
		
		
	}

}
