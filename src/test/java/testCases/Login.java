package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Commons{
		
	@Test(enabled = false)
	public void Logueo() {
		driver.navigate().to("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("automationprueba@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("abcd1234556");
		driver.findElement(By.name("SubmitLogin")).click();
		
		Assert.assertTrue(itemsPage.getFailedText().contains("Authentication failed."));

			
	}
	

}
