package AllmobilesMohan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUP {
	
	
	@Test
	   public void SignUpmethod () throws InterruptedException {
	         System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\GATTAMANENI.MOHAN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         Thread.sleep(1000);
	         LandingPage landingpage2 = new LandingPage(driver);
	         Thread.sleep(3000);
	         landingpage2.goTo();
	         Thread.sleep(2000);
	         landingpage2.signupapp("Mohan","krishna","moahn@gmail.com","mohan@54321" ,"26/09/2000","9912254647","My self mohan gattamaneni");
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	         driver.close();	 
	      }
	}