package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paramter {
	
	@DataProvider(name = "testdata")
    public Object[][] testData() {
        return new Object[][] {
            {"John Doe", 30},
            {"Jane Smith", 25},
            {"Michael Johnson", 35}
        };
    }

    @Test(dataProvider = "testdata")
    public void testMethod(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
