package JavaClassPrograms;

import java.util.Random;

/*
*@author Andy Kilgore
* @Version 1.0
 */
public class randomNumberSearch {
    public static void main(String[] args) {
        int[] random_numbers = new int[9];
        int count;
        boolean found = false;
        Random r = new Random();


        for (count = 0; count < 9; count++){
            int number = r.nextInt(10)+1;
            random_numbers[count] = number;
        }
        count = 0;
        for(count = 0; count < random_numbers.length; count++){
            if (random_numbers[count] == 7){
                found = true;
                break;
                }
            else{
                continue;
            }
        }
        if (found){
            System.out.println("The number 7 was found.");
        }
        else {
            System.out.println("The number 7 was not found.");
        }
    }
}
