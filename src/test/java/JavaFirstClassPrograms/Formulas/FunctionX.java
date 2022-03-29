package JavaClassPrograms.Formulas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionX {
	
	UnaryOperator<Double> fx = x->x<0
			? -x
			: x;
	BinaryOperator<Integer> f = (x,y)->x+y;

	public static void main(String[] args) {
		FunctionX f = new FunctionX();
		System.out.println(f.fx.apply(7.0));
		System.out.println(f.fx.apply(-7.0));
		System.out.println(f.f.apply(3, 4));
		

	}

}
