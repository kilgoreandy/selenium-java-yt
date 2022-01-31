package GuruTestSuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruDayTwoTest {
    ///Login using a valid username and password

    @Test
    public void firstTest() throws Exception{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4");
        driver.findElement(By.name("uid")).sendKeys("mngr382349");
        driver.findElement(By.name("password")).sendKeys("umajesU");
        driver.findElement(By.name("btnLogin")).click();
        if(driver.getTitle().contains("Guru99 Bank Manager HomePage")){
            System.out.println("Test Pass Login Successful");
        }
        else {
            Assert.fail();
        }
        driver.close();
    }
}
