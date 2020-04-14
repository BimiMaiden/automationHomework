package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends Commons{
		
	@Test//(enabled = false)
	public void searchWithResults() {	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Assert.assertTrue(itemsPage.getTitleText().contains("T-SHIRTS"),"Expected: "+itemsPage.getTitleText());
			
	}
	
	@Test//(enabled = false)
	public void searchWithNoResults() {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("sldkjfhkjfhk");
		driver.findElement(By.name("submit_search")).click();
		
		Assert.assertTrue(itemsPage.getNoResultsText().contains("sldkjfhkjfhk"));
	
	}	
	
	@Test//(enabled = false)
	public void Logueo() {
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("automationprueba@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd1234556");
		driver.findElement(By.name("SubmitLogin")).click();
		
		Assert.assertTrue(itemsPage.getFailedText().contains("Authentication failed."));

			
	}

}
