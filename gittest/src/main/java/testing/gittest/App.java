package testing.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    protected WebDriver driver;
    
    @Test
    public void tutoTest(){
    	WebDriver driver = new ChromeDriver();
    	String eTitle = "Meet Test";
    	String aTitle = "";
    	driver.get("http://www.guru99.com/");
    	driver.manage().window().maximize();
    	aTitle = driver.getTitle();
    	if(aTitle.contentEquals(eTitle)){
    		System.out.println("Test Passed");
    	}else{
    		System.out.println("Test Failed");
    	}
    	driver.close();
    }
}
