package testcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUSer {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop=new Properties();
		String File_URL=System.getProperty("user.dir")+ "\\src\\test\\java\\Utils\\outSuccessMessage.properties";

		FileOutputStream fout=new FileOutputStream(File_URL);
		
		

		WebDriverManager.chromedriver().setup(); // setting up browser driver=> chromeDriver
		
		WebDriver driver= new ChromeDriver();  //initialize web driver
		
		driver.get("https://rahulshettyacademy.com/client"); //redirected to URL
		driver.manage().window().fullscreen(); // to open browser window in full screen
		
		driver.findElement(By.xpath("//p[@class='login-wrapper-footer-text']")).click();		

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Muhammad");

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("tauseef");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("tauefasdassasasdas43asd3asds009@gmail.com");
		driver.findElement(By.xpath("//input[@id='userMobile']")).sendKeys("1234567890");
	
		WebElement Ocupation_dropDown=driver.findElement(By.xpath("//select[@class='custom-select ng-untouched ng-pristine ng-valid']"));
		Select dropdown= new Select(Ocupation_dropDown);
		dropdown.selectByVisibleText("Engineer");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("userPassword")).sendKeys("123456Aa@");
		driver.findElement(By.id("confirmPassword")).sendKeys("123456Aa@");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		String Expected_SuccessMEssage="Account Created Successfully";
		String Actual_SuccessMEssage="";
		Actual_SuccessMEssage=	driver.findElement(By.xpath("//h1[normalize-space()='Account Created Successfully']")).getText().toString();
	
		prop.setProperty("SuccessMEssage", Actual_SuccessMEssage);
		prop.store(fout, "Success Messages received from the web");
		
		System.out.println(Actual_SuccessMEssage);
		
		Assert.assertEquals(Actual_SuccessMEssage,Expected_SuccessMEssage,"Expected Sucess message is not same as expected");
	}
	
}
