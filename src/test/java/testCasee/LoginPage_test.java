package testCasee;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("tauseef1@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("123456Aa@");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		
		Thread.sleep(3000);
		String ActualURL=driver.getCurrentUrl();
		
		String expectedURL="https://rahulshettyacademy.com/client/dashboard/dash";
		
	
		Assert.assertEquals(ActualURL, expectedURL);
		
		
		driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//button[1]")).click();
		Thread.sleep(1000);
		
		
		String prodTitle=driver.findElement(By.xpath("//h2[normalize-space()='ZARA COAT 3']")).getText().toString();
		
		System.out.println(prodTitle);
	}

}
