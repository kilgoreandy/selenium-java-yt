package JavaClassPrograms.Formulas;

/**
 * Class to demonstrate accessors which
 * help with encapsulation
 * @author german
 *
 */
public class Elephant {
	// our instance variables
	int trunkSize = -5;
	String name = "Bert";
	
	
	// Accessor for the trunkSize
	public int getTrunkSize() {
		return trunkSize;
	}


	//Sets the trunk size
	public void setTrunkSize(int trunkSize) {
		// validate the input and make sure
		// trunk size is >0
		// this is why we use accessors to make
		// sure we don't get bad input 
		this.trunkSize = Math.max(trunkSize,0);
	}


	// acccessor for get name
	public String getName() {
		return name;
	}


	// sets the Name
	public void setName(String name) {
		this.name = name;
	}


	// main method to exercise some of the functionality
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		System.out.println(elephant.getName() + elephant.getTrunkSize());
	}
}
