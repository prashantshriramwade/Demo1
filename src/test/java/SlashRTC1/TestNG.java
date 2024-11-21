package SlashRTC1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG {

	@Test
	public void TestSM() {
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
	}
}
