package JavaClassPrograms.Formulas;

import java.util.Scanner;

/**

 * @author Andy Kilgore
 *
 */
public class ColaVendingMachine {
	// our instance variables
	int currentStock = 5;
	double price;
	int capacity = 5;
	String name;


	//Accessor for Name
	public String getName() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name ");
		name = s.next();
		return name;
	}

	public void sellBottle(){

	}

	public void restock(){

	}

	// main method to exercise some functionality
	public static void main(String[] args) {
		ColaVendingMachine g = new ColaVendingMachine();
		System.out.println("Giraffe " + g.getName() + " is " + g.getHeight() + " inches tall, " + g.getAge() +
				" years old, " + " and is walking " + g.getSteps() + " steps." );
	}
}
