package JavaClassPrograms;
import org.apache.logging.log4j.core.util.JsonUtils;
import java.util.ArrayList;
import java.util.Scanner;
/*
*@author Andy Kilgore
* @Version 1.0
 */
public class positiveNumber {
    public static void main(String[] args) {
        ArrayList<Integer> positive= new ArrayList<Integer>();
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all positive numbers, when you are finished, enter a 0 and press enter.");
        int answer = 500;
        try {

            while (answer != 0) {
                System.out.println("Enter Positive Number: ");
                answer = s.nextInt();
                if (answer < 0) {
                    System.out.println("Nice try I said positive");
                } else if (answer == 0) {
                    continue;
                } else {
                    positive.add(answer);
                }
            }
        }
        catch (Exception e){
            System.out.println("You did not listen. Rerun the program and enter a integer");
        }
        System.out.println("You entered: ");
        for (count = 0; count < positive.size(); count++){
            System.out.println(positive.get(count));
        }
    }
}