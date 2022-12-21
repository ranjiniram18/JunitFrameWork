package testjunitFramework;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jnuit_02 {
	WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");

		// Calling the chromedriver and maximising the browser window
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}

	@AfterClass

	public void tearDown() throws Exception {
		// any instances to be cleaned up can be done here
		driver.close();
		System.out.println("*************");// new comit changes
	}

	@Test
	public void test() {

		driver.findElement(By.id("userName")).sendKeys("Ranjini");
		driver.findElement(By.id("userEmail")).sendKeys("ranjini@gmail.com");

		WebElement curradr = driver.findElement(By.id("currentAddress"));
		curradr.sendKeys("123,cycolony,pune");
		String curr_add = curradr.getText();
		System.out.println(curradr.getText());

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		act.sendKeys(Keys.TAB).build().perform();// Above two lines in a single line
		WebElement paddr = driver.findElement(By.id("permanentAddress"));

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		String per_add = paddr.getText();
		System.out.println(paddr.getText());

		assertEquals(curr_add, per_add);

	}

}
