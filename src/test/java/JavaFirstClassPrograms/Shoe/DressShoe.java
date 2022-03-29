package JavaClassPrograms.Shoe;
import java.util.Scanner;
/*
 * @author Andy
 * @version 1
 * @
 */

public class DressShoe extends Shoe{
    //Constructor for DressShoe
    public DressShoe(int size, String color) {
        super(size, color);
    }

    //Main method asking user to input size, prints size
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dress shoe size:");
        int size =  scanner.nextInt();
        System.out.print("Enter dress shoe color:");
        String color =  scanner.next();
        DressShoe ds = new DressShoe(size, color);
        ds.showSize();
        ds.showColor();
    }
}
