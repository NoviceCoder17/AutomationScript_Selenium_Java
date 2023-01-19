package seleniumScripts;  //package

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	
	ChromeDriver driver; //An object of class called chromedriver 
	
	String url = "http://demo.guru99.com/v4"  ; //practice testing using this
	
	public void invokeBrowser(){ //new method, does not return anything
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\Selenium Testing\\driver1\\chromedriver.exe");
		
		driver = new ChromeDriver(); //initilize object driver, new keyword is to instantiate memory
		
		driver.manage().window().maximize();
		
		driver.get(url);  // gets url	
	}
	
	public void getTitle() {
		
		String titleOfPage= driver.getTitle();
		System.out.println("Title of the page is "+ titleOfPage);
	}
	
	public void closeBrowser() {
		//driver.close(); //current active window
		
		driver.quit(); // closes all windows
	}
	
	public static void main(String[] args) {
		WorkingWithChrome wc = new WorkingWithChrome();  // create instance of class working with chrome
		wc.invokeBrowser();
		wc.getTitle();
		wc.closeBrowser();
		
	}
	

}
