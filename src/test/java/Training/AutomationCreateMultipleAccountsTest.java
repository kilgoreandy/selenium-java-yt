//import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvValidationException;
//import org.junit.Before;
//import com.opencsv.CSVReader;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//public class AutomationCreateMultipleAccountsTest {
//    String CSV_PATH = "resources/AccountInfo.csv";
//    WebDriver driver;
//    private CSVReader csvReader;
//    String[] csvCell;
//
//    @Before
//    public void setup() throws Exception {
//
//
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        //driver.get("http://automationpractice.com/index.php");
//        driver.get("https://web.archive.org/web/20210515151630/http://automationpractice.com/index.php");
//    }
//
//
//    @Test
//    public void firstTest() throws IOException, CsvValidationException {
//
//        csvReader = new CSVReader(new FileReader(CSV_PATH));
//
//        while ((csvCell = csvReader.readNext()) != null) {
//
//                String gender = csvCell[0];
//                String fName = csvCell[1];
//                String lName = csvCell[2];
//                String email = csvCell[3];
//                String password = csvCell[4];
//                int birthday = Integer.valueOf(csvCell[5]);
//                String birthmonth = csvCell[6];
//                String birthyear = csvCell[7];
//                String newsletter = csvCell[8];
//                String offers = csvCell[9];
//                String addressFname = csvCell[1];
//                String addressLname = csvCell[2];
//                String company = csvCell[10];
//                String address1 = csvCell[11];
//                String city = csvCell[12];
//                String state = csvCell[13];
//                String zip = csvCell[14];
//                String country = csvCell[15];
//                String addinfo = csvCell[16];
//                String hphone = csvCell[17];
//                String mphone = csvCell[18];
//                String addressalias = csvCell[19];
//
//                driver.findElement(By.linkText("Sign in")).click();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElement(By.id("email_create")).click();
//                driver.findElement(By.id("email_create")).sendKeys(email);
//                driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
//                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//                driver.findElement(By.id("customer_firstname")).click();
//                driver.findElement(By.id("customer_firstname")).sendKeys(fName);
//                driver.findElement(By.id("customer_lastname")).sendKeys(lName);
//                driver.findElement(By.id("passwd")).sendKeys(password);
//
//                Select days = new Select(driver.findElement(By.id(("days"))));
//                //driver.findElement(By.id("days")).click();
//                days.selectByVisibleText("1");
//                Select month = new Select(driver.findElement(By.xpath("//*[@id='months']")));
//                driver.findElement(By.id("months")).click();
//                month.selectByVisibleText(birthmonth);
//                Select year = new Select(driver.findElement(By.xpath("//*[@id='years']")));
//                year.selectByVisibleText(birthyear);
//                if (newsletter == "TRUE") {
//                    driver.findElement(By.id("newsletter")).click();
//                }
//                if (offers == "TRUE") {
//                    driver.findElement(By.id("optin")).click();
//                }
//                driver.findElement(By.id("company")).click();
//                driver.findElement(By.id("company")).sendKeys(company);
//                driver.findElement(By.id("address1")).click();
//                driver.findElement(By.id("address1")).sendKeys(address1);
//                driver.findElement(By.id("city")).click();
//                driver.findElement(By.id("city")).sendKeys(city);
//                Select states = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));
//                states.selectByVisibleText(state);
//                driver.findElement(By.id("postcode")).click();
//                driver.findElement(By.id("postcode")).sendKeys(zip);
//                driver.findElement(By.id("other")).click();
//                driver.findElement(By.id("other")).sendKeys(addinfo);
//                driver.findElement(By.id("phone")).click();
//                driver.findElement(By.id("phone")).sendKeys(hphone);
//                driver.findElement(By.id("phone_mobile")).click();
//                driver.findElement(By.id("phone_mobile")).sendKeys(mphone);
//                driver.findElement(By.cssSelector(".form-group:nth-child(13)")).click();
//                driver.findElement(By.id("alias")).click();
//                driver.findElement(By.id("alias")).sendKeys(addressalias);
//                driver.findElement(By.cssSelector("#submitAccount > span")).click();
//                driver.findElement(By.linkText("Sign out")).click();
//                driver.close();
//
//            }
//        }
//    }
//
