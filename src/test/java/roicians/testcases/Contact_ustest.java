package roicians.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import roicians.baseclass.Testbase;
import roicians.pages.Contact_us;
import roicians.testdata.ExcelSheet;

public class Contact_ustest extends Testbase{
Contact_us Contact; //declared Contact us reference at class level so that we can use it throughout the class
public Contact_ustest() {
	super();//to call parent class/super class constructor we write super keyword,
	//this will call properties from testbase class.
}
@BeforeMethod
public void setprop() {
	initiate();//First with super keyword it will call properties like System.setproperty and then will switch to initiate method()
	Contact=new Contact_us(); //Assigned it to Contact_us object
}

@Test(priority=1)
public void titlevalidation() {
	String title=Contact.validatetitleContact();
	Assert.assertEquals(title,"Contact_us");
	
}
	@DataProvider
	public Object[][] SubjectData()
	{
		Object result[][] = ExcelSheet.readExcelData("Sheet1");
		return result;
	}


// To fetch data from excel sheet
@Test(priority=2, dataProvider = "SubjectData")
public void typeDetails() {
	
	Contact.typeDetails("Admin", "admin@gmail.com", "QA Training");
}

@AfterMethod
public void close() {
	driver.quit();
}

}
