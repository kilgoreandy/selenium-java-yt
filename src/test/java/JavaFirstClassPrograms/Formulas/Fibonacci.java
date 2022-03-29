package JavaClassPrograms.Formulas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Fibonacci {
	UnaryOperator<Integer> fib = n -> n<=1
			? 1
			: this.fib.apply(n-1) + this.fib.apply(n-2);
	
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		System.out.println(fib.fib.apply(7));

	}

}