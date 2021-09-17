package teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Repository.ObjectRepo;
import Repository.TestData;
import utility.Helper;

public class CoreSteps {
	
	WebDriver driver;
	
	public CoreSteps(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verifyHomePageLogo() {
		boolean result=Helper.verifyElement(driver.findElement(ObjectRepo.homeLogo));
		if(result)
		{
			System.out.println("element is displayed");
		}else {
			System.out.println("not displayed");
		}
	}
	
	public void clickCategoriesLink() {
		Helper.clickElement(driver.findElement(ObjectRepo.categoriesLink));
	}
	
	public void clickDealLink() {
		Helper.clickElement1(driver.findElement(ObjectRepo.dealsLink));
	}
	
	public void clickNewArrivalLink() {
		Helper.clickElement2(driver.findElement(ObjectRepo.NewArrivalLink));
	}
	
	public void clickOrderPickupandDelivery() {
		Helper.clickElement3(driver.findElement(ObjectRepo.OrderPickupDilevery));
	}
	
	
	
	public void verifyMenMenuText() {
		Helper.verifyText(driver.findElement(By.id("")), TestData.Menmenu);
	}
	
	

}
