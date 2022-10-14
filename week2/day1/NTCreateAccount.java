package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement currency = driver.findElement(By.name("currencyUomId"));
		Select obj1 = new Select(currency);
		obj1.selectByValue("INR");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testing");
		driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("1200");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select obj = new Select(industry);
		obj.selectByValue("IND_SOFTWARE");
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select obj2 = new Select(source);
		obj2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketingCampaign = driver.findElement(By.id("marketingCampaignId"));
		Select obj3 = new Select(marketingCampaign);
		obj3.selectByIndex(5);
		
		WebElement province = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj4 = new Select(province);
		obj4.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		String errorMessage = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();
		System.out.println("Error Message :" + errorMessage );
		driver.close();
	}

}
