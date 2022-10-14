package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
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
		WebElement sourceDrpdwn = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select obj = new Select(sourceDrpdwn);
		obj.selectByIndex(1);
		WebElement IndustryDrpdwn = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select obj1 = new Select(IndustryDrpdwn);
		obj1.selectByValue("IND_SOFTWARE");
		WebElement ownershipDrpdwn = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select obj2 = new Select(ownershipDrpdwn);
		obj2.selectByVisibleText("Public Corporation");
				
			}

}
