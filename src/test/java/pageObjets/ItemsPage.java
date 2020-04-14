package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ItemsPage {
	private WebDriver driver;
	private By titleBanner;
	private By noResultsBanner;
	private By orderSelect;
	private By authentication;
		
	public ItemsPage(WebDriver driver) {
		this.driver = driver;	
		titleBanner = By.xpath("//span[@class='lighter']");
		noResultsBanner = By.xpath("//*[@id='center_column']/p");
		orderSelect = By.id("selectProductSort");
		authentication = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
	}
	
	public String getTitleText() {
		return driver.findElement(titleBanner).getText();		
	}
	
	public String getNoResultsText() {
	
		return driver.findElement(noResultsBanner).getText();
	}
	
	public String getFailedText() {
		return driver.findElement(authentication).getText();
	}
	
	//en estos 3 public se muestran las 3 formas de buscar en ese menu,por el nombre(buscando que el texto coincida),por el value o por el lugar en el menu
	public void searchElement(String nameOfElement) {
		Select select = new Select(driver.findElement(orderSelect));
		select.selectByVisibleText(nameOfElement);		
	}	
	public void searchElementByValue(String value) {
		Select select = new Select(driver.findElement(orderSelect));
		select.selectByValue(value);		
	}	
	public void searchElementByIndex(int number) {
		Select select = new Select(driver.findElement(orderSelect));
        select.selectByIndex(number);		
	}
}
