package JavaClassPrograms.Shoe;

/*
 * @author German
 * @version 1
 * @
 */
public class Shoe {
	int size;
	String color;

	// Constructor for the shoe

	public Shoe(int size, String color) {
		this.size = size;
		this.color = color;
	}

	/**
	 * Methods to show size and color
	 */

	void showSize() {
		System.out.println("Size: " + this.size);
	}

	void showColor()
	{
		System.out.println("Color of shoe: " + this.color);
	}
}
