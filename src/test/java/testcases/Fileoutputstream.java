package testcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;

public class Fileoutputstream {
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		Properties FineInputStream
		
		Properties prop=new Properties();
		String File_URL=System.getProperty("user.dir")+ "\\src\\test\\java\\Utils\\OutPutFile.properties";

		FileOutputStream file_out=new FileOutputStream(File_URL);
		

		String Name="Paul smith";
		
		
			
		
		prop.setProperty("Name", Name);
		prop.setProperty("email","test1232@gmail.com");
		prop.setProperty("Desgination", "Sr. Software Engineer");
		prop.setProperty("password", "q123123123");
		
		System.out.println("data saved");
		
		prop.store(file_out, "Data  received from Web");

	}
}


