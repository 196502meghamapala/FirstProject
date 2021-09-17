package utility;

import org.openqa.selenium.WebElement;

public class Helper {
	
	public static boolean verifyElement(WebElement element) {
		return element.isDisplayed();
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static void clickElement1(WebElement element) {
		element.click();
	}
	
	public static void clickElement2(WebElement element) {
		element.click();
	}
	
	public static void clickElement3(WebElement element) {
		element.click();
	}
	
	
	public static void verifyText(WebElement element,String text) {
		if(element.getText().equals(text)) {
			System.out.println("text matched");
		}else {
			System.out.println("not matched");
		}
	}

}
