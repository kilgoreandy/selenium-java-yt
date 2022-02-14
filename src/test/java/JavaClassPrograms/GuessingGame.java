package JavaClassPrograms;
import java.util.Random;
import java.util.Scanner;

/*
* @author Andy Kilgore
* @version 1.0
 */
public class GuessingGame {

// created a main method that generates a random number and asks the user to guess. Until the guess is correct
// the while loop continues and keeps track or each guess.
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100)+1;
        Scanner s = new Scanner(System.in);
        System.out.println("Input your guess!: ");
        int answer = s.nextInt();
        while (answer != number){
            System.out.println("Nope, try guessing again");
            answer = s.nextInt();
            count++;
        }
        System.out.println("YEAH! You finally got it right!");
        System.out.println("You guessed it right in " + count + " attempts!");
    }
}