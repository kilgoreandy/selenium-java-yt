package Training;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DemoQACreateAccountTest {

    @Test
    public void firstTest() {
        JavascriptExecutor js;

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/books/");
        driver.manage().window().setSize(new Dimension(1900, 1017));
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("newUser")).click();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).sendKeys("Roger");
        driver.findElement(By.id("lastname")).sendKeys("Raswell");
        driver.findElement(By.id("userName")).sendKeys("RRaswell");
        driver.findElement(By.id("password-wrapper")).click();
        driver.findElement(By.id("password")).sendKeys("Qwertyuiop!1");
        new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-border"))).click();
        try {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();;
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.id("register")).click();
        assertThat(driver.switchTo().alert().getText(), is("User Register Successfully."));

    }
}
