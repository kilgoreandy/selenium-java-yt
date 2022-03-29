package JavaClassPrograms.Formulas;

public class TwoX {
	
	public float two_x(float x) {
		return x*x;
	}
	
	public float two_times_two_x(float x) {
		return 2*this.two_x(x);
	}

	public static void main(String[] args) {
		TwoX t = new TwoX();
		System.out.println(t.two_times_two_x(7));

	}

}
