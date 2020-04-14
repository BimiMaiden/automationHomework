package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import helpers.Waiters;
import pageObjets.IndexPage;
import pageObjets.ItemsPage;
import pageObjets.SectionsPage;

public class Commons {
	protected WebDriver driver;
	protected ItemsPage itemsPage;	
    protected IndexPage indexPage;
    protected SectionsPage sectionsPage;
    
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");
		driver.findElement(By.name("submit_search")).click();

		itemsPage = new ItemsPage(driver);
	    indexPage = new IndexPage(driver);
		sectionsPage = new SectionsPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterMethod
	public void tearDown() {
		Waiters.fixedwait();
		driver.close();
		driver.quit();		
	}	


}
