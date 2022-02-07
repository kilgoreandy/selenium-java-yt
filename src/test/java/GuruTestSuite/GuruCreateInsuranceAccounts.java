package GuruTestSuite;

import com.opencsv.CSVReader;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GuruCreateInsuranceAccounts {
    String CSV_PATH = "resources/guruInsurance.csv";
    String csvCell[];
    String DRIVER_PATH = "resources/chromedriver.exe";
    int count = 1;
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://demo.guru99.com/insurance/v1/index.php";
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void FirstTest() throws Exception {
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));

        while ((csvCell = csvReader.readNext()) != null) {
            String title = csvCell[0];
            String FirstName = csvCell[1];
            String Surname = csvCell[2];
            String number = csvCell[3];
            String birthyear = csvCell[4];
            String birthmonth = csvCell[5];
            String birthday = csvCell[6];
            String type = csvCell[7];
            String occupation = csvCell[9];
            String years = csvCell[8];
            String street = csvCell[10];
            String city = csvCell[11];
            String county = csvCell[12];
            String zip = csvCell[13];
            String email = csvCell[14];
            String password = csvCell[15];


            driver.get("https://demo.guru99.com/insurance/v1/index.php");
            driver.findElement(By.linkText("Register")).click();
            driver.findElement(By.id("user_title")).sendKeys(title);
            driver.findElement(By.id("user_firstname")).sendKeys(FirstName);
            driver.findElement(By.id("user_surname")).sendKeys(Surname);
            driver.findElement(By.id("user_phone")).sendKeys(number);
            new Select(driver.findElement(By.id("user_dateofbirth_1i"))).selectByVisibleText(birthyear);
            new Select(driver.findElement(By.id("user_dateofbirth_2i"))).selectByVisibleText(birthmonth);
            new Select(driver.findElement(By.id("user_dateofbirth_3i"))).selectByVisibleText(birthday);
            //logic for type
            switch (type) {
                case "Full":
                    driver.findElement(By.id("licencetype_t")).click();
                case "Provisional":
                    driver.findElement(By.id("licencetype_f")).click();
            }
            new Select(driver.findElement(By.id("user_licenceperiod"))).selectByVisibleText(years);
            driver.findElement(By.id("user_occupation_id")).click();
            driver.findElement(By.id("user_occupation_id")).sendKeys(occupation);


            driver.findElement(By.id("user_address_attributes_street")).sendKeys(street);
            driver.findElement(By.id("user_address_attributes_city")).sendKeys(city);
            driver.findElement(By.id("user_address_attributes_county")).sendKeys(county);
            driver.findElement(By.id("user_address_attributes_postcode")).clear();
            driver.findElement(By.id("user_address_attributes_postcode")).sendKeys(zip);
            driver.findElement(By.xpath("//form[@id='new_user']/div[5]/div")).click();
            driver.findElement(By.id("user_user_detail_attributes_email")).clear();
            driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys(email);
            driver.findElement(By.id("user_user_detail_attributes_password")).clear();
            driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys(password);
            driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).clear();
            driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys(password);
            Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(), "PNG", new File("Snaps/InsuranceAccount" + count + ".png"));
            count++;
            driver.findElement(By.name("submit")).click();
        }
        driver.close();
    }
}







//
//@AfterClass(alwaysRun = true)
//public void tearDown() throws Exception {
//        driver.quit();
//        String verificationErrorString = verificationErrors.toString();
//        if (!"".equals(verificationErrorString)) {
//        fail(verificationErrorString);
//        }
//        }
//
//private boolean isElementPresent(By by) {
//        try {
//        driver.findElement(by);
//        return true;
//        } catch (NoSuchElementException e) {
//        return false;
//        }
//        }
//
//private boolean isAlertPresent() {
//        try {
//        driver.switchTo().alert();
//        return true;
//        } catch (NoAlertPresentException e) {
//        return false;
//        }
//        }
//
//private String closeAlertAndGetItsText() {
//        try {
//        Alert alert = driver.switchTo().alert();
//        String alertText = alert.getText();
//        if (acceptNextAlert) {
//        alert.accept();
//        } else {
//        alert.dismiss();
//        }
//        return alertText;
//        } finally {
//        acceptNextAlert = true;
//        }
//        }
//        }
