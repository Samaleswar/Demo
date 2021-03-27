package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class Redifflogin {

		WebDriver driver;
		public Redifflogin(WebDriver driver) {
			
			
			this.driver=driver;
		}
		
	By username=By.cssSelector("#login1");
	By password=By.xpath("//input[@id='password']");
	//By proceed=	By.name("proceed");
	
	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Proceed()
	{
		return driver.findElement(withTagName("input").toRightOf(password));
	}
	
	}


