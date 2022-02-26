package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
	

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			WebElement elementUsername=driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			
			WebElement elementPassword=driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
			
			WebElement elementLoginButton=driver.findElement(By.className("decorativeSubmit"));
			elementLoginButton.click();
			
			WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ashwin");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arthi");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("HI");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arthixyz@gmail.com");
			
			WebElement elementDropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			Select dd=new Select(elementDropdown);
			dd.selectByVisibleText("Employee");

            WebElement elementDropdon=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select d=new Select(elementDropdon);
			d.selectByVisibleText("New York");
			
			
			driver.findElement(By.className("smallSubmit")).click();
			

		

	}

}
