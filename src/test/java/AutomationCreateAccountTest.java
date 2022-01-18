import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationCreateAccountTest {

    @Test
    public void firstTest() {
        JavascriptExecutor js;
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.get("https://tinyurl.com/5yamxppx");
        driver.manage().window().setSize(new Dimension(1900, 1017));
        try {
            driver.findElement(By.linkText("Sign out")).click();
        }
        catch (NoSuchElementException ex) {
            System.out.println(("skipping"));
        }
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys("88@macr2.com");
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
        try {
            driver.findElement(By.id("customer_firstname")).click();
        }
        catch (NoSuchElementException ex) {
            driver.findElement(By.id("email_create")).clear();
            driver.findElement(By.id("email_create")).sendKeys("468455@macr2.com");
            driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
            WebDriverWait wait = new WebDriverWait(driver, 3000);
            wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_firstname")));
            driver.findElement(By.id("customer_firstname")).click();
        }
        driver.findElement(By.id("customer_firstname")).sendKeys("Bob");
        //driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.id("customer_lastname")).sendKeys("Wick");
        driver.findElement(By.id("passwd")).sendKeys("password1");
        driver.findElement(By.id("days")).click();
        {
            WebElement dropdown = driver.findElement(By.id("days"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:5\\s+']")).click();
        }
        driver.findElement(By.cssSelector(".account_creation:nth-child(1) > .form-group:nth-child(7)")).click();
        driver.findElement(By.id("months")).click();
        {
            WebElement dropdown = driver.findElement(By.id("months"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:January\\s']")).click();
        }
        driver.findElement(By.id("years")).click();
        {
            WebElement dropdown = driver.findElement(By.id("years"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:1994\\s+']")).click();
        }
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("test company");
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("9938 county road 38");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("bankston");
        driver.findElement(By.id("id_state")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_state"));
            dropdown.findElement(By.xpath("//option[. = 'Florida']")).click();
        }
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("39945");
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("other")).sendKeys("Test account ");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("2054994547");
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("20549454784");
        driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
    }
}
