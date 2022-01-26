import com.opencsv.CSVReader;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;

public class GuruCreateAccounts {
    String CSV_PATH = "resources/Customer_Info.csv";
    String csvCell[];
    String DRIVER_PATH = "resources/chromedriver";
    WebDriver driver;
    int count = 1;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4");
        driver.manage().window().maximize();
        driver.findElement(By.name("uid")).click();
        driver.findElement(By.name("uid")).sendKeys("mngr382349");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("umajesU");
        driver.findElement(By.name("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try{
            driver.switchTo().frame("gdpr-consent-notice");
            driver.findElement(By.id("save")).click();
        }
        catch(NoSuchFrameException ex){
            System.out.println("Frame not detected");
        }
        driver.findElement(By.linkText("New Customer")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        try {
            driver.switchTo().frame("Advertisement");
            driver.findElement(By.id("dismiss-button")).click();

                    }
        catch(NoSuchElementException  ex){
            System.out.println("Cookie model not present");
            System.out.println("Ad model not present");
            driver.switchTo().frame(0);
        }
        catch(NoSuchFrameException ex) {
            System.out.println("Cookie model not present");
            System.out.println("Ad model not present");
        }



    }
    @Test
    public void FirstTest() throws Exception{
        CSVReader csvReader = new CSVReader(new FileReader(CSV_PATH));

        while ((csvCell = csvReader.readNext()) != null){
            String CustomerName = csvCell[0];
            String gender = csvCell[1];
            String dob = csvCell[2];
            String address = csvCell[3];
            String city = csvCell[4];
            String state = csvCell[5];
            String PIN = csvCell[6];
            String number = csvCell[7];
            String email = csvCell[8];
            String password = csvCell[9];

            driver.findElement(By.linkText("New Customer")).click();

            driver.findElement(By.name("name")).click();
            driver.findElement(By.name("name")).sendKeys(CustomerName);

            // logic for selecting gender:
            switch (gender){
                case "F":
                    driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > " +
                            "tr:nth-child(5)> td:nth-child(2) > input[type=radio]:nth-child(2)")).click();
                    break;
                case "M":
                    driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > tbody > " +
                            "tr:nth-child(5) > td:nth-child(2) > input[type=radio]:nth-child(1)")).click();
                    break;
            }

            WebElement dateBox = driver.findElement(By.xpath("//*[@id='dob']"));
            dateBox.sendKeys(dob);



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
            Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            ImageIO.write(screenshot.getImage(),"PNG",new File("Snaps/CustomerAccount" +count + ".png"));
            driver.findElement(By.cssSelector("body > table > tbody > tr > td > table > " +
                        "tbody > tr:nth-child(14) > td:nth-child(2) > input[type=submit]:nth-child(1)")).click();
            try {
                driver.switchTo().alert().accept();
            }
            catch (org.openqa.selenium.NoAlertPresentException ex){
                System.out.println("Email already exists moving on");
            }
            count++;
        }
        driver.close();
    }
}