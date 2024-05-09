package testcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTestCase {

	//verify that user should able to logged in into the system
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		Properties prop= new Properties();
		
		String File_URL=System.getProperty("user.dir")+ "\\src\\test\\java\\Utils\\InputFile.properties";
		String File_Out_URL=System.getProperty("user.dir")+ "\\src\\test\\java\\Utils\\outputfile3.properties";

		FileInputStream fis= new FileInputStream(File_URL);
		FileOutputStream fout= new FileOutputStream(File_Out_URL);

		prop.load(fis);
		
		
		WebDriverManager.chromedriver().setup(); // setting up browser driver=> chromeDriver
		
		WebDriver driver= new ChromeDriver();  //initialize web driver
		
		driver.get(prop.getProperty("URL")); //redirected to URL
//		driver.manage().window().fullscreen(); // to open browser window in full screen
		
		String pageURL= driver.getCurrentUrl();
		
		System.out.println(pageURL);
		

//		driver.findElement(By.id("userEmail")).sendKeys("tauseef1@gmail.com"); // sending input to the email field
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys(prop.getProperty("email")); 
		Thread.sleep(1000);  // to hold your script for seconds i.e 1000 mean one second
//		driver.findElement(By.id("userPassword")).sendKeys("123456Aa@");// sending input to the password field
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(prop.getProperty("PAssword"));
		
		Thread.sleep(1000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		
		
	
		
//		Assert.assertEquals(ExpectedURL, ActualURL);
		
		Thread.sleep(3000);
		String ExpectedURL="https://rahulshettyacademy.com/client/dashboard/dash";
		String ActualURL=driver.getCurrentUrl();
		
		Assert.assertEquals(ExpectedURL, ActualURL,"URL IS NOT SAME AS REQUIRED!!! User is not logged in");
		
		
		String EXPECTED_TITLE="Let's Shop";
		String ACTUAL_TITLE="";
		ACTUAL_TITLE=driver.getTitle();
		
		Assert.assertEquals(ACTUAL_TITLE, EXPECTED_TITLE,"Home page title is not same as expected");
		
		
		driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//button[1]")).click();
		Thread.sleep(2000);
		
		String Expected_tile="ZARA COAT 3";
		WebElement ACtual_product_Title;
		ACtual_product_Title=driver.findElement(By.xpath("//h2[normalize-space()='ZARA COAT 3']"));
		//comparing title
		Assert.assertEquals(Expected_tile, ACtual_product_Title.getText().toString(),"Product title is wrong testcase is failed");
		
			
	String productPrice="";
	productPrice=driver.findElement(By.xpath("//h3[normalize-space()='$ 31500']")).getText().toString();
	String productDesc="";
	productDesc=driver.findElement(By.xpath("//p[normalize-space()='Zara coat for Women and girls']")).getText().toString();
		
		prop.setProperty("Product_title", ACtual_product_Title.getText().toString());
		prop.setProperty("Product_price",productPrice );
		prop.setProperty("Product_desc", productDesc);
		
		
		prop.store(fout, "Product details received from web");
		
		
		
		
		//verify product title visibility
		
		Assert.assertTrue(ACtual_product_Title.isDisplayed());
		
		
//		driver.navigate().back();
//		driver.close();

	}

}
