package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objects.Redifflogin;
@Test
public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Working\\pritam_workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Redifflogin rl = new Redifflogin(driver);
		Thread.sleep(1000);
		rl.Email().sendKeys("hi");
		rl.Password().sendKeys("dumbass");
		rl.Proceed().click();
	}

}
