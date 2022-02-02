package JavaClassPrograms.Formulas;

import java.util.Scanner;

/**

 * @author Andy Kilgore
 *
 */
public class Giraffe {
	// our instance variables
	int height;
	int age;
	int steps;
	String name;
	
	
	// Accessor for the trunkSize
	public int getHeight() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the height of the animal in inches: ");
		height = scan.nextInt();
		return height;
	}

	//Accessor for Name
	public String getName() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name ");
		name = s.next();
		return name;
	}
	//Accessor for Age
	public Integer getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		age = sc.nextInt();
		return age;
	}
	//Accessor for Steps
	public Integer getSteps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the steps you want to walk ");
		steps = sc.nextInt();
		return steps;
	}

	// main method to exercise some functionality
	public static void main(String[] args) {
		Giraffe g = new Giraffe();
		System.out.println("Giraffe " + g.getName() + " is " + g.getHeight() + " inches tall, " + g.getAge() +
				" years old, " + " and is walking " + g.getSteps() + " steps." );
	}
}
