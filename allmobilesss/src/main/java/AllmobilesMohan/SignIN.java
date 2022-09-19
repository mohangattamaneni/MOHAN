package AllmobilesMohan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIN {
	
	
	@Test
	public void SignInmethod() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\GATTAMANENI.MOHAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         Thread.sleep(1000);
         
         LandingPage landingpage = new LandingPage(driver);
         landingpage.goTo();
         Thread.sleep(1000);
         landingpage.signinapplication("MohanKrishna","mohan@54321");
         Thread.sleep(2000);
         
         //Less than 3 character in username field 
         landingpage.signinapplication("Mo","mohan@5432");
         Thread.sleep(2000);
         
         //Less more than 20 character in username field 
         landingpage.signinapplication("Mohankrishnasdfhivuopdhsv","mohan@5432");
         Thread.sleep(2000);
         
         //less than 3 alphanumeric in password field 
         landingpage.signinapplication("Mohan","12");
         Thread.sleep(2000);
         
         //less more than 10 alphanumeric in password field 
         landingpage.signinapplication("Mohan","123875892085680510864206502");
         Thread.sleep(2000);
         
         //Leave blank in both fields 
         landingpage.signinapplication("","");
         
         driver.close();
            
       
    }
    
}


