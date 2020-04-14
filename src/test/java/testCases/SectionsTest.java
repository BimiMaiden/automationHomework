package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SectionsTest extends Commons{
	@Test//(enabled = false)
	public void dressesSection() {
		//indexPage.gotToDresses();
		driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");
		driver.navigate().to("http://automationpractice.com/index.php?id_category=11&controller=category");
		
		String sectionTitle = sectionsPage.getSectionsText();
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='cat-name']")).getText(), "SUMMER DRESSES ");		
				
		Assert.assertTrue(sectionTitle.matches("SUMMER DRESSES "));
		
		driver.navigate().to("http://automationpractice.com/index.php?id_product=5&controller=product#/size-s/color-blue");
				
			
	}
	
	@Test//(enabled = false)
	public void womenSection() {
		indexPage.gotToWomen();		
		driver.navigate().to("http://automationpractice.com/index.php?id_category=4&controller=category");
		
		String sectionTitle = sectionsPage.getSectionsText();
		Assert.assertEquals(driver.findElement(By.xpath("//span[@class='cat-name']")).getText(), "TOPS ");
		Assert.assertTrue(sectionTitle.matches("TOPS "));
		
		driver.navigate().to("http://automationpractice.com/index.php?id_product=2&controller=product#/size-s/color-white");
				
		
	}

}
