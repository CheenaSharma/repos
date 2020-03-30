package roicians.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ch {
	public static void main(String args[]) throws InterruptedException {
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.walmart.ca/en/shopping-list");
	
	 WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a/div/span"));

     Actions action = new Actions(driver);

     action.moveToElement(element).perform();

     Thread.sleep(3000);

     WebElement subelement =driver.findElement(By.linkText("My lists"));

     action.moveToElement(subelement).click().perform();

     Thread.sleep(1000);

     driver.findElement(By.cssSelector("#save-list-input")).sendKeys("List three");

     driver.findElement(By.xpath("//*[@id=\"save-list-button\"]")).click();

     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/form/input")).sendKeys("rice");

     driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/form/button")).click();

}}
