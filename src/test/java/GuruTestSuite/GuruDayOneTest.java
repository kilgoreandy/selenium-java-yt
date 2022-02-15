package GuruTestSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class GuruDayOneTest {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4");
    }


    ///Login using a valid username and password
    @Test
    public void firstTest() {

    driver.findElement(By.name("uid")).sendKeys("mngr382349");
    driver.findElement(By.name("password")).sendKeys("umajesU");
    driver.findElement(By.name("btnLogin")).click();
    driver.close();
    driver.quit();
    }



}






