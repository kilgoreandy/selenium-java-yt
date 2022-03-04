package JavaClassPrograms;
/*
 *@Author Andy Kilgore
 * @Version 1.0
 */
//Recursive program that calls itself to factor entered number.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number you want to recurse");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(factor(number));
    }
    static int factor(int number){
        if (number != 0){
            return (number * factor(number-1));
        }
        else return 1;
    }
}
