package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();		
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		loginButton.click();
		WebElement crmlink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crmlink.click();
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		WebElement creatLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		creatLead.click();
		WebElement companyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyName.sendKeys("Infosys");
		WebElement firstName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys("Lavanya");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lastName.sendKeys("NV");
		
		WebElement clickCreatLead = driver.findElement(By.xpath("//input[@name='submitButton']"));
		clickCreatLead.click();
	}

}
