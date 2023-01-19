package guru99application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class guru99appication_test {
	
	ChromeDriver driver;
	String url= "https://demo.guru99.com/v4/";
	
	//run using annotations
	
	@Test(priority=-100)
	public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selenium Testing\\driver1\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Test(priority=0)
	public void verifyTheTitleOfPage()
	{
		String expectedTitle = "Guru99 Bank Home Page";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=100)
	public void verifyUserlogin() {
		WebElement userId= driver.findElement(By.name("uid"));
		WebElement userpwd = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.name("btnLogin"));
		
		userId.sendKeys("mngr472337");
		userpwd.sendKeys("yhugEbe");
		loginBtn.click();	
	}
	
	
	@Test(priority=200)
	public void addCustomer() {
		WebElement addCustomerlink = driver.findElement(By.linkText("New Customer"));
		addCustomerlink.click();
		driver.findElement(By.xpath("//input[@value='m']")).click();
		
	}
	
	
	@Test
	public void getcustomerId() {
		String customerID= driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]td[2]")).getText();
		System.out.println("Customer ID - " + customerID);
	}
}
