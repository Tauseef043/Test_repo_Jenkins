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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignIn_Test {
	String pageURL;

    @Test(priority = 1)
    public void LoginWIthValidCreds() throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // setting up browser driver=> chromeDriver

        WebDriver driver = new ChromeDriver();  //initialize web driver

        driver.get("https://rahulshettyacademy.com/client"); //redirected to URL
//		driver.manage().window().fullscreen(); // to open browser window in full screen

        pageURL = driver.getCurrentUrl();

        System.out.println(pageURL);


//		driver.findElement(By.id("userEmail")).sendKeys("tauseef1@gmail.com"); // sending input to the email field
        driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("tauseef1@gmail.com");
        Thread.sleep(1000);  // to hold your script for seconds i.e 1000 mean one second
//		driver.findElement(By.id("userPassword")).sendKeys("123456Aa@");// sending input to the password field
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("123456Aa@");

        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();


    }

    @Test(priority = 2)
    public void invalidCreds() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // setting up browser driver=> chromeDriver

        WebDriver driver = new ChromeDriver();  //initialize web driver

        driver.get("https://rahulshettyacademy.com/client"); //redirected to URL
//		driver.manage().window().fullscreen(); // to open browser window in full screen

        pageURL = driver.getCurrentUrl();

        System.out.println(pageURL);


//		driver.findElement(By.id("userEmail")).sendKeys("tauseef1@gmail.com"); // sending input to the email field
        driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("taus2eef1@gmail.com");
        Thread.sleep(1000);  // to hold your script for seconds i.e 1000 mean one second
//		driver.findElement(By.id("userPassword")).sendKeys("123456Aa@");// sending input to the password field
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("12345s6Aa@");

        Thread.sleep(1000);
        driver.findElement(By.id("login")).click();

    }	


}
