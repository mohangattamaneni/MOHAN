package AllmobilesMohan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Allmobile {
	
	
	
	@Test
	 public void allmobiles() throws InterruptedException
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\GATTAMANENI.MOHAN\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         Thread.sleep(1000);
	         LandingPage landingpage4 = new LandingPage(driver);
	         landingpage4.goTo();
	         Thread.sleep(1000);
	         landingpage4.searchbox("samsung");
	         Thread.sleep(1000);
	         landingpage4.searchbox("Apple");
	         Thread.sleep(1000);
	         landingpage4.searchbox("lenovo");
	         Thread.sleep(1000);
	         landingpage4.searchbox("sa");
	         Thread.sleep(1000);
	         landingpage4.searchbox("12345");
	         Thread.sleep(1000);
	         landingpage4.searchbox("@#$^&*!");
	         
	         driver.close();
	         
	    }
	}


