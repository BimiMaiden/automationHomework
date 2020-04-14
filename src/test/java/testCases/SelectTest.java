package testCases;

import org.testng.annotations.Test;

public class SelectTest extends Commons {
				
	@Test//(enabled = false)
	public void searchByLowestFirst() {
		itemsPage.searchElementByIndex(5);
		
	}
	
	@Test//(enabled = false)
	public void searchByNameAtoZ() {
		itemsPage.searchElementByValue("name:desc");
		
	}
	
	@Test//(enabled = false)
	public void searchByInStock() {
		itemsPage.searchElement("Reference: Lowest first");
		
	
	}

}
