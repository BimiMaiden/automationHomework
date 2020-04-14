package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Waiters;

public class IndexPage {
	private By searchBox;
	private By submitButton;
	private By womenLink;
	private By dressesLink;
	WebDriver driver;
	
	public IndexPage(WebDriver driver) {
		this.driver=driver;
		searchBox = By.id("search_query_top");
		submitButton = By.className("btn btn-default button-search");
		womenLink = By.linkText("Women");
		dressesLink = By.linkText("Dresses");
	}
	
	public void search(String item) {
		driver.findElement(searchBox).sendKeys(item);
		driver.findElement(submitButton).click();
		Waiters.fixedwait();
	}
	
	public void gotToWomen() {
		driver.findElement(womenLink).click();
		Waiters.fixedwait();

	}
	public void gotToDresses() {
		driver.findElement(dressesLink).click();
		Waiters.fixedwait();
		
	}
}
