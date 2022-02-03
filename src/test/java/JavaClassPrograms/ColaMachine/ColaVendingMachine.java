package JavaClassPrograms.ColaMachine;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * @author Andy Kilgore
 *
 */
public class ColaVendingMachine {
	// our instance variables
	int currentStock = 5;
	double price = 4.50;
	int capacity = 5;
	String name;
    double answer;
    double change;
//Constructor
    public ColaVendingMachine() {}
    //Accessor for Name
	public String getName() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name ");
		name = s.next();
		return name;
	}
    //Asks User name, sells bottle and decreases from currentStock. If current Stock is 0, calls to restock.
	public void sellBottle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello " + name + ", please insert $4.50 to purchase drink.");
        try {answer = scan.nextDouble();}
        catch (Exception ex ) {
            System.out.println("Not a valid currency please restart program. Thanks!");
            answer = 0.0;
            System.out.println(answer);
            System.out.println(price);
        }
        if (answer < price){
            System.out.println("Looks like you did not give me enough money. I need $4.50 USD please restart.");
        }
        else {
            if (answer > price)
                dispenseChange();
            System.out.println("Thanks! Dispensing your drink now!");
            currentStock -=1;
            System.out.println("Drink is dispensed. Please grab below ");
            System.out.println("Debug mode is set to on: CurrentStock: " + currentStock);
            if (currentStock == 0) {restock();}
        }
	}
    //Sets the current stock to capacity
	public void restock(){
        System.out.println("Just a sec while I restock my inventory");
        currentStock = capacity;
        System.out.println("Restocked!");
	}
    public void dispenseChange(){
        DecimalFormat df = new DecimalFormat("##.##");
        change = answer-price;
        System.out.println("You fed me too much! Giving you back $" + (df.format(change)));
    }
	 //main method to exercise some functionality
	public static void main(String[] args) {
		ColaVendingMachine c = new ColaVendingMachine();
        while (c.currentStock != 0){
            c.getName();
            c.sellBottle();
        }
	}
}
