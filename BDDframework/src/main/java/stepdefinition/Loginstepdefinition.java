package stepdefinition;


import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Loginstepdefinition {
	WebDriver driver;
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://spec.atsspecsolutions.com");
			driver.manage().deleteAllCookies();
	}

@When("^user enters username and password$")
public void user_enters_username_and_password() {
	
//	driver.findElement(By.xpath("//svg[contains(@class,'MuiSvgIcon-root-817 ats-762')]/input[@name='username']")).getAttribute("aria-hidden");
	driver.get("https://spec.atsspecsolutions.com");
	WebDriverWait wait = new WebDriverWait( driver , 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dovini5510@one-mail.top");
	
	//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("dovini5510@one-mail.top");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='password']")));
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ats123456");
}

@Then("^user click on login button$")
public void user_click_on_login_button() {
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	
}

@Then("^user click on new project$")
public void user_click_on_new_project() 
{
	WebDriverWait wait = new WebDriverWait( driver , 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'New Project')]")));
	
	driver.findElement(By.xpath("//span[contains(text(),'New Project')]")).click();
	
	
}

@Then("^user click on internal no and porject name$")
public void user_click_on_internal_no_and_porject_name() throws Throwable {
	WebDriverWait wait = new WebDriverWait( driver , 10);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='1580503947446']")));
	driver.findElement(By.xpath("//div[label = 'Internal No. (if applicable)']/div/input")).sendKeys("123");
	driver.findElement(By.xpath("//div[label = 'Project Name *']/div/input")).sendKeys("QA");
	
	 }
@Then("^user click on Country and State/Province$")
public void user_click_on_Country_and_State_Province() throws Throwable {
	WebDriverWait wait = new WebDriverWait( driver , 10);
	
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[label = 'Country *']/div/div/input")));
	WebElement country=driver.findElement(By.xpath("//div[label = 'Country *']/div/div/input"));
	driver.findElement(By.xpath("//div[label = 'Country *']/div/div/input")).click();
	WebElement c=driver.findElement(By.xpath("//div[label = 'Country *']/div/div/input"));
	
	c.sendKeys("Canada");
	//Select country=new Select(driver.findElement(By.xpath("//div[label = 'Country *']/div/div/input")));
	
	driver.findElement(By.xpath("//div[label = 'State/Province *']/div/div/input")).click();
WebElement e=driver.findElement(By.xpath("//div[label = 'State/Province *']/div/div/input"));
	
	e.sendKeys("Ontario");
}

@Then("^user click on City and Address$")
public void user_click_on_City_and_Address() throws Throwable {
	driver.findElement(By.xpath("//div[label = 'City *']/div/div/input")).click();
	WebElement f=driver.findElement(By.xpath("//div[label = 'City *']/div/div/input"));
	Thread.sleep(1000);
	f.getAttribute("Toronto");
	f.sendKeys("Toronto");
	driver.findElement(By.xpath("//div[label = 'Address']/div/textarea")).sendKeys("garfella dr");
	
    
}

@Then("^user click on Bid\\.date and area$")
public void user_click_on_Bid_date_and_area() throws Throwable {
	driver.findElement(By.xpath("//div[label = 'Bid Date *']/div/input")).sendKeys("1998/12/16");
	driver.findElement(By.xpath("//div[label = 'Area (in sq. ft.) *']/div/input")).sendKeys("300");
	
   
}

@Then("^user click on next button$")
public void user_click_on_next_button() throws Throwable {
	driver.findElement(By.xpath("//span[contains (text(), 'Next')]")).click();
	}
@Then("^user click on multiple building classes and select education and daycare$")
public void user_click_on_multiple_building_classes_and_select_education_and_daycare() throws Throwable {
	WebDriverWait wait = new WebDriverWait( driver , 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Education')]")));
	
	driver.findElement(By.xpath("//p[contains(text(), 'Education')]")).click();
	driver.findElement(By.xpath("//span[contains(text(), 'College / University')]")).click();
}

@Then("^click on next button$")
public void click_on_next_button() throws Throwable {
	WebDriverWait wait = new WebDriverWait( driver , 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Next')]")));
	
	driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
	
	
}
@Then("^click on finish$")
public void click_on_finish() throws Throwable {
	WebDriverWait wait = new WebDriverWait( driver , 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Finish')]")));
	
	driver.findElement(By.xpath("//span[contains(text(), 'Finish')]")).click();
	
	
}

}

   

	
