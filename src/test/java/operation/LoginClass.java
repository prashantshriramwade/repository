package operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	WebDriver driver;
	String webUrl="https://qauatoldui.slashrtc.in";
	
	public void setUp() throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get(webUrl);
		driver.manage().window().maximize();
        Thread.sleep(100);

		driver.findElement(By.name("username")).sendKeys("slashadmin");
		Thread.sleep(100);

		driver.findElement(By.id("password")).sendKeys("Admin@123");
		Thread.sleep(100);
		
		driver.findElement(By.id("loginProcess")).click();
		Thread.sleep(100);
	}
	
}
