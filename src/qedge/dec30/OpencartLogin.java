package qedge.dec30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v96.page.Page.GetAppIdResponse;
import org.openqa.selenium.support.ui.Select;

public class OpencartLogin {

	public static void main(String[] args)throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.cssSelector("#input-username"));
		username.clear();
		username.sendKeys("ramu manchu ");
		WebElement firstname=driver.findElement(By.cssSelector("#input-firstname"));
		firstname.clear();
		firstname.sendKeys("ramu");
		WebElement lastname =driver.findElement(By.cssSelector("#input-lastname"));
		lastname.clear();
		lastname.sendKeys("manchu");
		WebElement email =driver.findElement(By.cssSelector("#input-email"));
		email.clear();
		email.sendKeys("ramumanchu@gmail.com");
		WebElement element =driver.findElement(By.cssSelector("#input-country"));
		Select sel=new Select(element);
		sel.selectByVisibleText("india");
		WebElement password =driver.findElement(By.cssSelector("#input-password"));
		password.clear();
		password.sendKeys("ramu123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
	}

}
