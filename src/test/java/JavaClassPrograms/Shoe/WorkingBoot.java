package JavaClassPrograms.Shoe;
import java.util.Scanner;
/*
 * @author Andy
 * @version 1
 * @
 */

public class WorkingBoot extends Shoe{

    public WorkingBoot(int size, String color) {
        super(size, color);
    }

    //Main method asking user to input size, prints size
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Work Boot size:");
        int size =  scanner.nextInt();
        System.out.print("Enter Work Boot color:");
        String color =  scanner.next();
        WorkingBoot wb = new WorkingBoot(size, color);
        wb.showSize();
        wb.showColor();
    }
}
