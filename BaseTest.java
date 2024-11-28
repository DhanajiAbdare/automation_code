package lobby_utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;	
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String bro) throws InterruptedException
	{
		if(bro.equals("chrome")) {
			System.out.println("\n  -----Launch the 'Chrome' browser-----");
	        WebDriverManager.chromedriver().setup(); 
	        driver = new ChromeDriver();
	        
//	        // Disable browser features that are not needed for testing
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--disable-extensions");
//	        options.addArguments("--disable-notifications");
	        
//	        ChromeOptions option = new ChromeOptions();
//	        option.setHeadless(true);				//1.two way to use
//	        option.addArguments("--headless=new"); 	//2.The browser will run in headless mode, performing all actions without displaying the UI.
//	        driver = new ChromeDriver(option);
		}
		else if (bro.equals("edge")) {
			System.out.println("\n  -----Launch the 'Edge' browser-----");
	        WebDriverManager.edgedriver().setup();      
	        driver = new EdgeDriver();
		}
		else {
			System.out.println("\n  -----Launch the 'FireFox' browser-----");
	        WebDriverManager.firefoxdriver().setup();      
	        driver = new FirefoxDriver();
		}
		System.out.println("\n Enter the URL of New Dingdong Lobby ");
		driver.get("https://hkb2-dd-dev-ui.api-hkbgaming88.com/api/lobby/abc/10017/TTJ_Chetan"); 
		Thread.sleep(5000);   
        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException 
	{
		driver.quit();
	}
}
