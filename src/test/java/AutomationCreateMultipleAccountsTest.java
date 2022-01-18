import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;

public class AutomationCreateMultipleAccountsTest {
    int count;
    CSVReader excelopen = new CSVReader(new FileReader(fileName : "resources/AccountInfo.csv"));
    String cell[];

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        while ((cell = reader.readNext()) != null))
        {
            String gender = cell[0];
            String fName = cell[1];
            String lName = cell[2];
            String email = cell[3];
            String password = cell[4];
            String birthday = cell[5];
            String birthmonth = cell[6];
            String birthyear = cell[7];
            String newsletter = cell[8];
            String offers = cell[9];
            String addressFname = cell[1];
            String addressLname = cell[2];
            String company = cell[9];
            String address1 = cell[10];
            String city = cell[11];
            String state = cell[12];
            String zip = cell[13];
            String country = cell[14];
            String addinfo = cell[15];
            String hphone = cell[16];
            String mphone = cell[17];
            String addressalias = cell[18];

            driver.get("http://automationpractice.com/index.php");
            driver.manage().window().setSize(new Dimension(1900, 1017));
            driver.findElement(By.linkText("Sign in")).click();
            driver.findElement(By.id("email_create")).click();
            driver.findElement(By.id("email_create")).sendKeys(email);
            driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
            driver.findElement(By.id("customer_firstname")).click();

            driver.findElement(By.id("customer_firstname")).sendKeys(fName);
            driver.findElement(By.id("customer_lastname")).sendKeys(lName);
            driver.findElement(By.id("passwd")).sendKeys(password);
            Select day = new Select(driver.findElement(By.xpath("//*[@id='days']")));
            day.selectByVisibleText(birthday);
            Select month = new Select(driver.findElement(By.xpath("//*[@id='months']")));
            month.selectByVisibleText(birthmonth);
            Select year = new Select(driver.findElement(By.xpath("//*[@id='years']")));
            year.selectByVisibleText(birthyear);
            if (newsletter == "TRUE") {
                driver.findElement(By.id("newsletter")).click();
            }
            if (offers == "TRUE"){
                driver.findElement(By.id("optin")).click();
            }
            driver.findElement(By.id("company")).click();
            driver.findElement(By.id("company")).sendKeys(company);
            driver.findElement(By.id("address1")).click();
            driver.findElement(By.id("address1")).sendKeys(address1);
            driver.findElement(By.id("city")).click();
            driver.findElement(By.id("city")).sendKeys(city);
            Select states = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
            states.selectByVisibleText(state);
            driver.findElement(By.id("postcode")).click();
            driver.findElement(By.id("postcode")).sendKeys(zip);
            driver.findElement(By.id("other")).click();
            driver.findElement(By.id("other")).sendKeys(addinfo);
            driver.findElement(By.id("phone")).click();
            driver.findElement(By.id("phone")).sendKeys(hphone);
            driver.findElement(By.id("phone_mobile")).click();
            driver.findElement(By.id("phone_mobile")).sendKeys(mphone);
            driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
            driver.findElement(By.id("alias")).click();
            driver.findElement(By.id("alias")).sendKeys(addressalias);
            driver.findElement(By.cssSelector("#submitAccount > span")).click();
            driver.findElement(By.linkText("Sign out")).click();
            driver.close();
        }
    }
}
