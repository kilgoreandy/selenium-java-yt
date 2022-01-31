package GuruTestSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDayOneTest {
    ///Login using a valid username and password
    @Test
    public void firstTest() {
    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.demo.guru99.com/V4");
    driver.findElement(By.name("uid")).sendKeys("mngr382349");
    driver.findElement(By.name("password")).sendKeys("umajesU");
    driver.findElement(By.name("btnLogin")).click();
    driver.close();
    driver.quit();
    }



}






