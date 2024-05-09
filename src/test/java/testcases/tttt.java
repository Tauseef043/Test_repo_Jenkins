package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

public class tttt {
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		Properties FineInputStream
		
		String name="TAUSEEF";
		
		Properties prop= new Properties();  //initializing class object
//		FileInputStream fis= new FileInputStream("C:\\Users\\muham\\eclipse-workspace\\FIrstSeleniumProject\\src\\test\\java\\Utils\\InputFile.properties");
		
		String File_URL=System.getProperty("user.dir")+ "\\src\\test\\java\\Utils\\InputFile.properties";
		FileInputStream fis= new FileInputStream(File_URL);
//		System.out.println(File_URL);
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("Tile"));
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("PAssword"));
		
		

		
		String naame="Muhammadd ";
		String lname="tauseef";
		String emaaail="Muhammadtousif123@gmail.com";
		char a='a';
		int number=25;

	}
}
