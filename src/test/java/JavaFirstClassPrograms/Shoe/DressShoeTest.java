package JavaClassPrograms.Shoe;
/*
*@Version 1.0
*@Author Andy Kilgore
 */
import JavaClassPrograms.User;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
import static junit.framework.TestCase.assertTrue;
//A few junit tests that verify only valid sizes are allowed and fails other inputs.
public class DressShoeTest {
    @Test
    public void firstTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dress shoe size:");

        Integer size =  scanner.nextInt();
        assertTrue(size > 0 );
        System.out.print("Enter dress shoe color:");
        String color =  scanner.next();
        String cl = color.getClass().toString();
        DressShoe ds = new DressShoe(size, color);
        ds.showSize();
        ds.showColor();
    }
    @Test
    public void secondTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dress shoe size:");

        Integer size =  scanner.nextInt();
        assertTrue(size > 0 );
        System.out.print("Enter dress shoe color:");
        String color =  scanner.next();
        String cl = color.getClass().toString();
        DressShoe ds = new DressShoe(size, color);
        ds.showSize();
        ds.showColor();
    }
    @Test
    public void lastTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dress shoe size:");
        Integer size =  scanner.nextInt();
        assertTrue(size > 0 );
        System.out.print("Enter dress shoe color:");
        String color =  scanner.next();
        String cl = color.getClass().toString();
        DressShoe ds = new DressShoe(size, color);
        ds.showSize();
        ds.showColor();
    }
}
