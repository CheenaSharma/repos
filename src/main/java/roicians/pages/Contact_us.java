package roicians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import roicians.baseclass.Testbase;

public class Contact_us extends Testbase {

//Page repository or object repository
	@FindBy(name="your-name")
	WebElement Name;
	@FindBy(name="your-email")
	WebElement Email;
	@FindBy (name="your-subject")
	WebElement Subject;
	//initiate page object
public Contact_us() {
	PageFactory.initElements(driver, this); //this means current class object and driver is coming from base class


}
public String validatetitleContact() {
	return driver.getTitle();
}
public void typeDetails(String name,String email ,String subject ) {
	Name.sendKeys(name);
	Email.sendKeys(email);
	Subject.sendKeys(subject); //either we can specify them separately or together in one method
	
}

}
