package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		//FirefoxDriver driver= new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();		
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
		WebElement creatLead = driver.findElement(By.linkText("Create Lead"));
		creatLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Infosys");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Lavanya");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("NV");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("Lavi");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("ECE");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Details of Lead");
		WebElement emailID = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailID.sendKeys("lavanya@gamil.com");		
		WebElement clickCreatLead = driver.findElement(By.name("submitButton"));
		clickCreatLead.click();
		WebElement editLead = driver.findElement(By.linkText("Edit"));
		editLead.click();
		WebElement clearDescription = driver.findElement(By.id("updateLeadForm_description"));
		clearDescription.clear();
		WebElement importantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		importantNote.sendKeys("Testing imp topics");
		WebElement updateLead = driver.findElement(By.className("smallSubmit"));
		updateLead.click();
		System.out.println("Page title is    "+ driver.getTitle());
		driver.close();			
	}

}
