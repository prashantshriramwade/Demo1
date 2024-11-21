package SlashRTC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AgentCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://qauatoldui.slashrtc.in");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("slashadmin");
		System.out.println("we have put the username field");

		driver.findElement(By.id("password")).sendKeys("Admin@123");
		System.out.println("we have put the username field");
		
		driver.findElement(By.id("loginProcess")).click();
		System.out.println("we have put the password field");
		
		driver.findElement(By.id("tabOperations")).click();
		System.out.println("we are on Dashborard");
		
		driver.findElement(By.xpath("//a[@id='tabOperations']/p")).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
//		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Users'])[4]/following::button[1]")).click();
//
//		driver.findElement(By.linkText("Create user")).click();
//		
//		WebElement username = driver.findElement(By.id("userFirstName"));
//		username.click();
//		username.sendKeys("test3");
		
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Campaigns'])[2]/following::button[1]")).click();
		Thread.sleep(100);
		driver.findElement(By.linkText("Campaign Create")).click();
		Thread.sleep(100);
			driver.findElement(By.id("normal-field")).sendKeys("Campaigntest3");
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@id='main-wrapper']/div/div/div/div[2]/form/div[2]/input")).sendKeys("Campaigntest3");
			Thread.sleep(100);
			driver.findElement(By.name("client")).sendKeys("Vodafone");
			Thread.sleep(100);
			driver.findElement(By.xpath("//div[@id='main-wrapper']/div/div/div/div[2]/form/div[4]/span/span/span/ul")).click();
			Thread.sleep(100);
			System.out.println("AutoSupervisorTesting");
			WebElement supervisor=driver.findElement(By.id("select2"));
			Select Supr = new Select(supervisor);
			Supr.selectByVisibleText("autoSupervisor Testing ( autoSupervisor )");
			
			
	}

	
}
