package JavaClassPrograms.Shoe;

import java.util.Scanner;

public class RunningShoe extends Shoe {

	public RunningShoe(int size, String color) {
		super(size, color);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter running shoe size:");
		int size =  scanner.nextInt();
		System.out.print("Enter running shoe color:");
		String color =  scanner.next();
		RunningShoe rs = new RunningShoe(size, color);
		rs.showSize();
		rs.showColor();
	}
}
