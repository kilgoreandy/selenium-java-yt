package Training;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Before;
import com.opencsv.CSVReader;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class AutomationCreateMultipleAccountsTest {
    String CSV_PATH = "resources/AccountInfo.csv";
    WebDriver driver;
    private CSVReader csvReader;
    String[] csvCell;
    @Before
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    public void firstTest() throws IOException, CsvValidationException, InterruptedException {
        csvReader = new CSVReader(new FileReader(CSV_PATH));
        while ((csvCell = csvReader.readNext()) != null) {
            String gender = csvCell[0];
            String fName = csvCell[1];
            String lName = csvCell[2];
            String email = csvCell[3];
            String password = csvCell[4];
            String birthday = (csvCell[5]);
            String birthmonth = csvCell[6];
            String birthyear = csvCell[7];
            String newsletter = csvCell[8];
            String offers = csvCell[9];
            String addressFname = csvCell[1];
            String addressLname = csvCell[2];
            String company = csvCell[10];
            String address1 = csvCell[11];
            String city = csvCell[12];
            String state = csvCell[13];
            String zip = csvCell[14];
            String country = csvCell[15];
            String addinfo = csvCell[16];
            String hphone = csvCell[17];
            String mphone = csvCell[18];
            String addressalias = csvCell[19];
            driver.findElement(By.linkText("Sign in")).click();
            driver.findElement(By.id("email_create")).sendKeys(email);
            driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
            Thread.sleep(10000);
            System.out.println(driver.findElement(By.id("create_account_error")).isDisplayed());
            try {

                if (driver.findElement(By.id("create_account_error")).isDisplayed()) {
                    System.out.println("Email already exists. ");
                    continue;
                } else {
                    System.out.println("account not found in our system creating new account.");
                }
            }
            catch(NoSuchElementException ex){
                System.out.println("neither");
            }
                driver.findElement(By.id("customer_firstname")).sendKeys(fName);
                driver.findElement(By.id("customer_lastname")).sendKeys(lName);
                driver.findElement(By.id("passwd")).sendKeys(password);
                driver.findElement(By.id("days")).sendKeys("1");
                driver.findElement(By.id("months")).sendKeys(birthmonth);
                driver.findElement(By.id("years")).sendKeys(birthyear);
                if (newsletter == "TRUE") {driver.findElement(By.id("newsletter")).click();                }
                if (offers == "TRUE") {driver.findElement(By.id("optin")).click();                }
                driver.findElement(By.id("company")).sendKeys(company);
                driver.findElement(By.id("address1")).sendKeys(address1);
                driver.findElement(By.id("city")).sendKeys(city);
                driver.findElement(By.id("id_state")).sendKeys(state);
                driver.findElement(By.id("postcode")).sendKeys(zip);
                driver.findElement(By.id("other")).sendKeys(addinfo);
                driver.findElement(By.id("phone")).sendKeys(hphone);
                driver.findElement(By.id("phone_mobile")).sendKeys(mphone);
                driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
                driver.findElement(By.id("alias")).sendKeys(addressalias);
                driver.findElement(By.cssSelector("#submitAccount > span")).click();
                driver.findElement(By.linkText("Sign out")).click();
            }
        driver.close();
        driver.quit();
        }
    }

