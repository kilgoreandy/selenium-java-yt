import com.opencsv.CSVReader;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;

public class GuruCreateAccounts {
    String CSV_PATH = "resources/Customer_Info.csv";
    String csvCell[];
    String DRIVER_PATH = "resources/chromedriver.exe";
    WebDriver driver;

    @Before
    public void setup() throws Exception{
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4");
        driver.findElement(By.name("uid")).click();
        driver.findElement(By.name("uid")).sendKeys("mngr382349");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("umajesU");
        driver.findElement(By.name("btnLogin")).click();
    }
    @Test
    public void FirstTest() throws Exception{
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));

        while ((csvCell = csvReader.readNext()) != null){
            String CustomerName = csvCell[0];
            String gender = csvCell[1];;
            String dob = csvCell[2];
            String address = csvCell[3];
            String city = csvCell[4];
            String state = csvCell[5];
            String PIN = csvCell[6];
            String number = csvCell[7];
            String email = csvCell[8];
            String password = csvCell[9];

            driver.findElement(By.cssSelector("body > div:nth-child(6) > div > ul > li:nth-child(2) > a")).click();
            driver.findElement(By.name("name")).click();
            driver.findElement(By.name("name")).sendKeys(CustomerName);

            // logic for selecting gender:
            switch (gender){
                case "F":
                    driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > " +
                            "tr:nth-child(5)> td:nth-child(2) > input[type=radio]:nth-child(2)")).click();
                default:
                    driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > " +
                            "tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")).click();
            }

            driver.findElement(By.id("dob")).click();
            driver.findElement(By.id("dob")).sendKeys(dob);
            driver.findElement(By.name("addr")).click();
            driver.findElement(By.name("addr")).sendKeys(address);
            driver.findElement(By.name("city")).click();
            driver.findElement(By.name("city")).sendKeys(city);
            driver.findElement(By.name("state")).click();
            driver.findElement(By.name("state")).sendKeys(state);
            driver.findElement(By.name("pinno")).click();
            driver.findElement(By.name("pinno")).sendKeys(PIN);
            driver.findElement(By.name("telephoneno")).click();
            driver.findElement(By.name("telephoneno")).sendKeys(number);
            driver.findElement(By.name("emailid")).click();
            driver.findElement(By.name("emailid")).sendKeys(email);
            driver.findElement(By.name("password")).click();
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > " +
                    "tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)")).click();
        }
    }
}
