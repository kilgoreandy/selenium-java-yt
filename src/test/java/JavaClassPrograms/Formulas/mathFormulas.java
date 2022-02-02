package JavaClassPrograms.Formulas;

public class mathFormulas {
	
	public float functionOne(int x) {
		return (2*x)+3;
	}
	public float functionTwo(int x) {
		return (x*x) + (3*x) + 9;
	}
	public float functionThree(int x) {
		return (x*x*x) + (4*x) + 7;
	}
	public double findHypotenuse(int x, int y) {
		float z = ((x*x)+ (y*y));
		double c = Math.sqrt(z);
		return c;
	}
	public float squarePerimeter(int x) {
		return 4*x;
	}
	public float squareArea(int x) {
		return x*x;
	}
	public float rectArea(int x, int y) {
		return x*y;
	}
	public double triangleArea(int x, int y) {
		return (0.5 * (x*y));
	}


	public static void main(String[] args) {
		mathFormulas f = new mathFormulas();
		System.out.println("The result of f(x) = 2(x)+3 is: " + f.functionOne(5));
		System.out.println("The result of f(x) = x^2+3x+9 is: " + f.functionTwo(7));
		System.out.println("The result of f(x) = x^3+4x+7 is: " + f.functionThree(4));
		System.out.println("The result of findHypotenuse is: " + f.findHypotenuse(7, 4));
		System.out.println("The result of squarePerimeter is: " + f.squarePerimeter(4));
		System.out.println("The result of squareArea is: " + f.squareArea(7));
		System.out.println("The result of rectArea is: " + f.rectArea(7,2));
		System.out.println("The result of triangleArea is: " + f.triangleArea(5,4));




	}

}
