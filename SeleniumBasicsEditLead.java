package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumBasicsEditLead {
	

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
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DCBCorps");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("QPT");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lee");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Qpt");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("XYZ");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Edit Lead");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("editlead@gmail.com");
			
			WebElement elementDropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
			
			Select dd=new Select(elementDropdown);
			dd.selectByVisibleText("Employee");

            WebElement elementDropdon=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select d=new Select(elementDropdon);
			d.selectByVisibleText("New York");
			
			
			driver.findElement(By.className("smallSubmit")).click();
			
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This View is seen after Editing the Details");
		
			driver.findElement(By.className("smallSubmit")).click();
		
			System.out.println("The title is:"+ driver.getTitle());
			if(driver.getTitle().contains("View Lead")) {
				System.out.println("I confirm the title has View Lead");
			}else
				System.out.println("The Title doesnot have the word Testleaf");

	}

}







